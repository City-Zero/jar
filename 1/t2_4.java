/*************************************************************************
	> File Name: t2_4.java
	> Author: 
	> Mail: 
	> Created Time: 2016年09月03日 星期六 17时57分55秒
 ************************************************************************/
import java.util.Scanner;

public class t2_4
{
    public static void main(String args[]) {
        double x1,x2,y1,y2,r1,r2,s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle1s center x-, y-coordinates, and radius:");
        String inp1,inp2;
        inp1 = sc.nextLine();
        System.out.print("Enter circle2s center x-, y-coordinates, and radius:");
        inp2 = sc.nextLine();
        inp1 = inp1.trim();
        inp2 = inp2.trim();
        String []temp1 = inp1.split(" ");
        String []temp2 = inp2.split(" ");
        x1 = Double.parseDouble(temp1[0]);
        y1 = Double.parseDouble(temp1[1]);
        r1 = Double.parseDouble(temp1[2]);
        x2 = Double.parseDouble(temp2[0]);
        y2 = Double.parseDouble(temp2[1]);
        r2 = Double.parseDouble(temp2[2]);
        s = Math.pow(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2),0.5);
        if(s <= Math.abs(r1 - r2)) {
            System.out.println("circle2 is inside circle1");
        } else if(s <= Math.abs(r1 + r2)) {
            System.out.println("circle2 overlaps circle1");
        } else{
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
