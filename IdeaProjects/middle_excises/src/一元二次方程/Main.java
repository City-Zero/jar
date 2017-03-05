package 一元二次方程;

import java.util.Scanner;

/**
 * Created by lyt on 17-1-5.
 */
public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double dai = Math.pow(b,2) - 4 * a * c;
        if(Math.abs(dai) <= Math.pow(10,-6)){
            dai = 0;
        }
        if(dai < 0){
            System.out.println("The equation has no real roots.");
        }else if(dai == 0){
            double x = -1*b / 2 / a;
            System.out.printf("The root is:%.2f.",x);
        }else{
            double x1 = (-1.0*b + Math.pow(dai,0.5))/2.0/a;
            double x2 = (-1.0*b - Math.pow(dai,0.5))/2.0/a;
            System.out.printf("The roots are %.2f and %.2f.",x1,x2);
        }
    }
}
