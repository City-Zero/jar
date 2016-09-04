/*************************************************************************
    > File Name: 2.2.java
    > Author:
    > Mail:
    > Created Time: 2016年09月03日 星期六 09时31分02秒
 ************************************************************************/
import java.util.Scanner;

public class t2_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        float hour;
        float rate,f_tax,s_tax;
        System.out.print("Enter employee's name:");
        name = sc.next();
        System.out.print("Enter number of hours worked in week:");
        hour = sc.nextInt();
        System.out.print("Enter hourly pay rate:");
        rate = sc.nextFloat();
        System.out.print("Enter federal tax withholdying rate:");
        f_tax = sc.nextFloat();
        System.out.print("Enter state tax withholding rate:");
        s_tax = sc.nextFloat();
        System.out.println("Employee Name:"+ name);
        System.out.println("Hours Worked:"+ hour);
        System.out.println("Pay Rate:$"+ rate);
        System.out.println("Cross Pay:$"+ rate * hour);
        System.out.println("Deductions:");
        System.out.println("Federal Withholding("+ f_tax * 100 + "%):$"+ rate * hour * f_tax);
        System.out.println("State Withholding("+ s_tax * 100 + "%):$" + rate * hour * s_tax);
        System.out.println("Total Deduction:$"+ (rate * hour) * (f_tax + s_tax));
        System.out.println("Net Pay:$"+ (rate * hour) *(1 - f_tax - s_tax));
    }
}
