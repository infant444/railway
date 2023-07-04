
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Infant Raj
 */
public class billaction {

    public static void add(bill ob1) throws Exception {
        File f = new File("billno.txt");
        try {
            if (f.length() == 0) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("billno.txt", true));
                oos.writeObject(ob1);
                oos.close();
            } else {
                MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream("billno.txt",
                        true));
                oos.writeObject(ob1);
                oos.close();
            }
        } catch (Exception e) {
            System.out.println("Error Occurred" + e);
        }
    }

    public static boolean search(String u) throws Exception {
        ObjectInputStream fread = new ObjectInputStream(new FileInputStream("billno.txt"));
        bill ob;
        while (true) {
            try {
                ob = (bill) fread.readObject();
                if (ob.x.equals(u)) {
                    fread.close();
                    return false;
                }
            } catch (EOFException e) {
                break;
            }
        }
        fread.close();

        return true;
    }
}
