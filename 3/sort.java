/*************************************************************************
	> File Name: student.java
	> Author:
	> Mail:
	> Created Time: 2016年09月23日 星期五 09时08分10秒
 ************************************************************************/
import java.util.Scanner;
class Student {
    String name;
    double mark;

    void input(String name,double mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class sort {
    public static void main(String args[]) {
        int n;
        System.out.print("请输入学生数量:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String name;
        double mark;
        Student[] st = new Student[n];
        for(int i = 0; i < n; i++) {
            name = sc.next();
            mark = sc.nextDouble();
            st[i].input(name,mark);
        }
    }
}
