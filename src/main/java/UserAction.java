
import java.io.*;

public class UserAction {

    public static void add(Userinfo ob1) throws Exception {
        File f = new File("user1.txt");
        try {
            if (f.length() == 0) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user1.txt", true));
                oos.writeObject(ob1);
                oos.close();
            } else {
                MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream("user1.txt",
                        true));
                oos.writeObject(ob1);
                oos.close();
            }
        } catch (Exception e) {
            System.out.println("Error Occurred" + e);
        }
    }

    public static boolean search(String u, String p) throws Exception {
        ObjectInputStream fread = new ObjectInputStream(new FileInputStream("user1.txt"));
        Userinfo ob;
        while (true) {
            try {
                ob = (Userinfo) fread.readObject();
                if (ob.uname.equals(u) && ob.pword.equals(p)) {
                    fread.close();
                    return true;
                }
            } catch (EOFException e) {
                break;
            }
        }
        fread.close();
        return false;
    }
}


