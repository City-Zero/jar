package 对字符串进行排序输出;

import java.util.Scanner;

/**
 * Created by lyt on 17-1-5.
 */
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //声名大小为字符串长度的字符数组
        char ch[] = new char[s.length()];

        //字符串转字符数组的方法
        ch = s.toCharArray();
        java.util.Arrays.sort(ch);

        //字符串的一种构造方法，参数为字符数组
        s = new String(ch);
        System.out.println(s);
    }
}
