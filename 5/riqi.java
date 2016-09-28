/*************************************************************************
	> File Name: riqi.java
	> Author:
	> Mail:
	> Created Time: 2016年09月28日 星期三 19时54分18秒
 ************************************************************************/
import java.util.Date;
public class riqi {
    public static void main(String[] args) {
        Date a = new Date(10000);
        System.out.println(a.toString());
        a.setTime(100000);
        System.out.println(a.toString());
        a.setTime(1000000);
        System.out.println(a.toString());
        a.setTime(10000000);
        System.out.println(a.toString());
        a.setTime(100000000);
        System.out.println(a.toString());
        a.setTime(1000000000);
        System.out.println(a.toString());
    }
}
