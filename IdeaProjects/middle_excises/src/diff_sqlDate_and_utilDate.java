/**
 * Created by lyt on 16-12-7.
 */
public class diff_sqlDate_and_utilDate {
    public static void main(String []args){
        java.util.Date da = new java.util.Date(1234567891);
        java.sql.Date db = new java.sql.Date(1234567891);
        System.out.println(da.toString() + "\n" + db.toString());
        java.sql.Date d = new java.sql.Date(1234567891);
        java.util.Date dd = new java.util.Date(d.getTime());
        System.out.println(dd);
    }
}
