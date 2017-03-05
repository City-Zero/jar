/**
 * Created by lyt on 16-12-7.
 */
import java.util.HashMap;
public class Map {
    public static void main(String []args){
        HashMap<String,Integer> mm = new HashMap <String,Integer>();
        mm.put("lyt",19);
        mm.put("zxw",20);
        System.out.print(mm.get("lyt"));
    }
}
