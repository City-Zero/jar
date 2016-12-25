import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Created by lyt on 16-12-14.
 */
public class t19_3 {
    public static void main(String []args){
        try {
            DataInputStream input = new DataInputStream(new FileInputStream("E19_3.dat"));
            int s,n;
            s = 0;
            while((n = input.readInt()) != -1){
                System.out.println(n);
                s += n;
            }
            input.close();
            System.out.println(s);
        }catch(Exception ex){
            System.err.println(ex);
        }
    }
}
