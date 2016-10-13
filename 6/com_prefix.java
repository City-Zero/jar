/*************************************************************************
	> File Name: com_prefix.java
	> Author:
	> Mail:
	> Created Time: 2016年10月13日 星期四 21时12分43秒
 ************************************************************************/
import java.lang.StringBuilder;
import java.util.Scanner;
public class com_prefix {
    public static String prefix(String s1,String s2) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s1.length() && i < s2.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i))
                break;
            else {
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(prefix(s1,s2));
    }
}
