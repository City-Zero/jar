/**
 * Created by lyt on 16-12-7.
 */
import java.sql.Date;
public class date {
    public static void main(String []args){
        Date dt = new Date(1234567891);
        System.out.println(dt.toString());
        Date dd = new Date(1234567891 + 100 * 24 * 60 * 60 *1000);
        System.out.println(dd);
    }
}
