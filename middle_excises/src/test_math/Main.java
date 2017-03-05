package test_math;

import java.util.Scanner;

/**
 * Created by lyt on 17-1-4.
 */
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int n = 0;
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '.'){
                n++;
                if(n>=2){
                    System.out.println("false");
                    break;
                }
            }
            if(s.charAt(i) != '.' &&(s.charAt(i) > '9' || s.charAt(i) < '0' )){
                System.out.println("false");
                a = 1;
                break;
            }
        }
        if(a == 0 && n <=1){
            System.out.println("true");
        }
    }
}
