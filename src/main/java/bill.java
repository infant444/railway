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
public class bill implements Serializable{
    String x;
    public bill(String u)
    {
        this.x=u;
    }
}
