package 求解给定字符串的前缀;

import java.util.Scanner;

/**
 * Created by lyt on 17-1-5.
 */
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a1 = sc.next();
            String a2 = sc.next();
            same(a1,a2);
        }
    }

    public static void same(String s1,String s2){
        int flag = 1;
        int i;
        for(i=0;i<s1.length() && i < s2.length();i++){
            if(s1.charAt(i) == s2.charAt(i)){
                flag = 0;
            }else{
                break;
            }
        }
        if(flag == 1){
            System.out.println("No common prefix");
        }else{
            System.out.println("The common prefix is "+s1.substring(0,i));
        }
    }
}
