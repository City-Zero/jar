/*************************************************************************
	> File Name: t2_2.java
	> Author:
	> Mail:
	> Created Time: 2016年09月03日 星期六 10时14分16秒
 ************************************************************************/
import java.util.Scanner;

public class t2_2 {
    public static void main(String args[]) {
        double s,area;
        System.out.print("Entre three points  for a triangle:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.trim();
        String []temp = input.split(" ");
        double nums[] = new double[temp.length];
        for(int i = 0; i<temp.length; i++) {
            nums[i] = Double.parseDouble(temp[i]);
        }
/*        for(int i = 0; i<temp.length; i++) {
            System.out.print(nums[i] + " ");
        }
*/
        double side1,side2,side3;
        side1 = Math.pow((Math.pow((nums[0]-nums[2]),2) + Math.pow((nums[1] - nums[3]),2)),0.5);
        side2 = Math.pow((Math.pow((nums[0]-nums[4]),2) + Math.pow((nums[1] - nums[5]),2)),0.5);
        side3 = Math.pow((Math.pow((nums[2]-nums[4]),2) + Math.pow((nums[3] - nums[5]),2)),0.5);
//        System.out.println(side1+" "+side2+" "+side3);
        s = (side1 + side2 + side3) / 2;
//        System.out.println(s);
        area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)),0.5);
        System.out.println(area);
    }
}
