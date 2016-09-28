/*************************************************************************
	> File Name: Account.java
	> Author: 
	> Mail: 
	> Created Time: 2016年09月10日 星期六 21时39分02秒
 ************************************************************************/
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Account
{
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    int id = 0;
    double balance = 0;
    private double annualInterestRate = 0.034;
    private Date dateCreated = new Date();

    Account()
    {
    }

    Account(int a,double b)
    {
        id = a;
        balance = b;
    }

    void getMonthlyInterestRate()
    {
        System.out.print("annualInterestRate:"); 
        System.out.println(annualInterestRate/12); 
    }

    void withDraw()
    {
        System.out.print("请输入取出的金额:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        balance -= a;
    }

    void deposit()
    {
        System.out.print("请输入存入的金额:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        balance += a;
    }

    void change()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入修改后的id:");
        id = sc.nextInt();
        System.out.print("请输入修改后的balance:");
        balance = sc.nextDouble();
        System.out.print("请输入修改后的annualInterestRate:");
        annualInterestRate = sc.nextDouble();
    }


    void display_0()
    {
        System.out.println("id:" + id + "\nbalance:" + balance + "\nannualInterestRate:" + annualInterestRate); 
    }

    void display_1()
    {
        System.out.println("dateCreated:" + dateCreated);
    }

    public static void main(String args[])
    {
        Account ac = new Account();
        ac.change();
        ac.withDraw();
        ac.deposit();
        ac.display_0();
        ac.getMonthlyInterestRate();
        ac.display_1();
    }
}
