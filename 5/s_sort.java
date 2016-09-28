/*************************************************************************
	> File Name: s_sort.java
	> Author:
	> Mail:
	> Created Time: 2016年09月28日 星期三 20时17分33秒
 ************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class s_sort {
    public static String sort(String s) {
        int i,j;
        char temp;
        char[] ch = new char[s.length()];
        for(i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for(i = 0; i < s.length() - 1; i++) {
            for(j = 0; j < s.length() - 1 - i; j++) {
                if(ch[j] > ch[j + 1]) {
                    temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        String ss = new String(ch);
        return ss;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(sort(s));
    }
}
