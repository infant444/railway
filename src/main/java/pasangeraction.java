
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class pasangeraction {

    public static void add(pasanger ob1) throws Exception {
        File f = new File("panangerinfo.txt");
        try {
            if (f.length() == 0) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("panangerinfo.txt", true));
                oos.writeObject(ob1);
                oos.close();
            } else {
                MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream("panangerinfo.txt",
                        true));
                oos.writeObject(ob1);
                oos.close();
            }
        } catch (Exception e) {
            System.out.println("Error Occurred" + e);
        }
    }

    public static pasanger search(String u) throws Exception {
        pasanger x = new pasanger();
        ObjectInputStream fread = new ObjectInputStream(new FileInputStream("panangerinfo.txt"));
        pasanger ob;
        while (true) {
            try {
                ob = (pasanger) fread.readObject();
                if (ob.a.equals(u)) {
                    x.a = ob.a;
                    x.b = ob.b;
                    x.c = ob.c;
                    x.d = ob.d;
                    x.e = ob.e;
                    x.f = ob.f;
                    x.g = ob.g;
                    x.h = ob.h;
                    x.i = ob.i;

                    fread.close();
                    return x;
                }
            } catch (EOFException e) {
                break;
            }
        }
        fread.close();
        return x;
    }
}
