/*************************************************************************
	> File Name: QuadraticPolygon.java
	> Author: 
	> Mail: 
	> Created Time: 2016年09月10日 星期六 22时50分27秒
 ************************************************************************/
import java.util.Scanner;

public class QuadraticPolygon
{
    private int a,b,c;

    QuadraticPolygon()
    {

    }
    void get_a()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入a的值:");
        a = sc.nextInt();
    }
    void get_b()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入b的值:");
        b = sc.nextInt();
    }
    void get_c()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入c的值:");
        c = sc.nextInt();
    }

    QuadraticPolygon(int x,int y,int z)
    {
        a = x;
        b = y;
        c = z;
    }

    void getDiscriminant()
    {
        System.out.println("darrta:" + (Math.pow(b,2) - 4*a*c));
    }

    void getRoot1()
    {
        System.out.println("root1:" + (((-b) + (Math.pow(b,2) - (4*a*c)))/2*a));
    }
    void getRoot2()
    {
        System.out.println("root2:" + (((-b) - (Math.pow(b,2) - (4*a*c)))/2*a));
    }

    public static void main(String args[])
    {
        QuadraticPolygon qu = new QuadraticPolygon();
        qu.get_a(); 
        qu.get_b(); 
        qu.get_c();

        qu.getRoot1();
        qu.getRoot2();
    }
}
