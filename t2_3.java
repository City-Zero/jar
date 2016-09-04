/*************************************************************************
	> File Name: t2.3.java
	> Author:
	> Mail:
	> Created Time: 2016年09月03日 星期六 17时23分48秒
 ************************************************************************/
import java.util.Scanner;

public class t2_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,deerta,r1,r2;
        System.out.print("Enter a,b,c:");
        String input = sc.nextLine();
        input = input.trim();
        String []temp = input.split(" ");
        a = Double.parseDouble(temp[0]);
        b = Double.parseDouble(temp[1]);
        c = Double.parseDouble(temp[2]);
        deerta = Math.pow(Math.pow(b,2) - 4 * a * c,0.5);
        if(deerta > 0) {
            r1 = (b * (-1) - deerta) / 2 / a;
            r2 = (b * (-1) + deerta) / 2 / a;
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if(deerta == 0) {
            r1 = (b * (-1)) / 2 / a;
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }

    }
}
