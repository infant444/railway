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
public class pasanger implements Serializable {
    String a,c,d,e;
    int b,f,g,h,i;
     public pasanger()
     {
         a=c=d=e=null;
         b=f=g=h=0;
     }
    public pasanger(String p,int q,String r,String s,String t,int u,int w,int x,int y)
    {
        a=p;
        b=q;
        c=r;
        d=s;
        e=t;
        f=u;
        g=w;
        h=x;
        i=y;
    }
}
