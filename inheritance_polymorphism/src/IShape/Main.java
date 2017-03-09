package IShape;

/**
 * Created by lyt on 17-1-4.
 */
import java.util.Scanner;
import java.text.DecimalFormat;

interface IShape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

/*你写的代码将嵌入到这里*/
class RTriangle  implements IShape{
    private double a;
    private double b;

    public RTriangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return a * b / 2;
    }

    public double getPerimeter(){
        return a + b + (Math.pow(Math.pow(a,2) + Math.pow(b,2),0.5));
    }

}


public class Main {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        IShape r = new RTriangle(a, b);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}
