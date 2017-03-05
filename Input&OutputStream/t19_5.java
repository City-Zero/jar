import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.Date;

/**
 * Created by lyt on 16-12-14.
 */
public class t19_5 {
    public static void main(String []args){
        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("E19_5.dat"));
            for(int i = 1;i <= 5;i++){
                output.writeInt(i);
            }
            output.writeObject(new Date());
            output.writeDouble(5.5);
            output.close();
        }catch(Exception ex){
            System.err.println(ex);
        }
    }
}
