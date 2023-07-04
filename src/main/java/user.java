
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
public class user {
        public static void add(Userinfo ob1) throws Exception {
        File f = new File("user2.txt");
        try {
            if (f.length() == 0) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user2.txt", true));
                oos.writeObject(ob1);
                oos.close();
            } else {
                MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream("user2.txt",
                        true));
                oos.writeObject(ob1);
                oos.close();
            }
        } catch (Exception e) {
            System.out.println("Error Occurred" + e);
        }
    }

    public static String search(String u) throws Exception {
        ObjectInputStream fread = new ObjectInputStream(new FileInputStream("user2.txt"));
        Userinfo ob;
        while (true) {
            try {
                ob = (Userinfo) fread.readObject();
                if (ob.uname.equals(u)) {
                    fread.close();
                    return ob.pword;
                }
            } catch (EOFException e) {
                break;
            }
        }
        fread.close();
        return "Invalid Username";
    }
}
