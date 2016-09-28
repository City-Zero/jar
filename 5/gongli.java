/*************************************************************************
	> File Name: gongli.java
	> Author:
	> Mail:
	> Created Time: 2016年09月28日 星期三 20时07分08秒
 ************************************************************************/
import java.util.GregorianCalendar;
public class gongli {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.println(today.get(GregorianCalendar.YEAR) + " " + today.get(GregorianCalendar.MONTH) +  " " + today.get(GregorianCalendar.DAY_OF_MONTH));
        today.setTimeInMillis(1234567898765L);
        System.out.println(today.get(GregorianCalendar.YEAR) + " " + today.get(GregorianCalendar.MONTH) +  " " + today.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
