import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Random;

/**
 * Created by lyt on 16-12-14.
 */
public class xt19_3 {
    public static void main(String []args){
        Random ra = new Random();
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("E19_3.dat"));
            for(int i = 1;i <= 10;i++)
                output.writeInt(ra.nextInt());
            output.close();
        }catch(Exception ex){
            System.err.println(ex);
        }
    }
}
