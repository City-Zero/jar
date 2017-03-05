package 计算正五边形的面积和周长;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by lyt on 17-1-5.
 */

abstract class shape {// 抽象类

/*抽象方法 求面积 */ public abstract double getArea();

/* 抽象方法 求周长 */ public abstract double getPerimeter();
}

class RPentagon extends shape{
    double a;
    public RPentagon(double a){
        this.a = a;
    }

    public double getArea(){
        //S=(1/4)a^2√(25+10√5)
        return (Math.pow(a,2)*Math.pow(Math.pow(5,0.5)*10 + 25,0.5))/4;
    }

    public double getPerimeter(){
        return a * 5;
    }

}
public class Main {
    public static void main(String []args){
        DecimalFormat df = new DecimalFormat("#.####");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        RPentagon rp = new RPentagon(a);
        System.out.println(df.format(rp.getArea()) +
                '\n' + df.format(rp.getPerimeter()));
    }
}
