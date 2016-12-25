/**
 * Created by lyt on 16-12-22.
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
        //没有声名会自动调用父类的无参构造方法
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled){
        this.radius = radius;

        //不可直接设置，因为是似有数据
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    //求面积
    public double getArea(){
        return radius * radius * Math.PI;
    }

    //求直径
    public double getDiameter(){
        return 2 * radius;
    }

    //求周长
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("This circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    @Override
    public String toString() {
        //super可以调用父类的方法或成员
        return super.toString() + "\nradius is " + radius;
    }
}
