import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

/**
 * Created by lyt on 16-12-14.
 */
public class t19_8 {
    public static void main(String []args){
        try{
            DataInputStream input = new DataInputStream(new FileInputStream("E19_8.dat"));
            int n = input.readInt();
            input.close();
            DataOutputStream output = new DataOutputStream(new FileOutputStream("E19_8.dat"));
            n += 1;
            System.out.println("running times:" + n);
            output.writeInt(n);
            output.close();
        }catch(Exception ex){
            try{
                DataOutputStream output = new DataOutputStream(new FileOutputStream("E19_8.dat"));
                int a = 0;
                System.out.println("running times:1");
                output.writeInt(1);
                output.close();
            }catch(Exception ea){
                System.err.println(ea);
            }
        }
    }
}
