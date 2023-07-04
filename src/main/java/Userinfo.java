
import java.io.*;

class MyObjectOutputStream extends ObjectOutputStream {

    MyObjectOutputStream() throws IOException {
        super();
    }

    MyObjectOutputStream(OutputStream o) throws IOException {
        super(o);
    }

    public void writeStreamHeader() throws IOException {

    }
}

public class Userinfo implements Serializable {

    String name, gmail, phono, uname, pword;

    public Userinfo(String n, String g, String pno, String u, String p) {
        name = n;
        gmail = g;
        phono = pno;
        uname = u;
        pword = p;
    }
}
