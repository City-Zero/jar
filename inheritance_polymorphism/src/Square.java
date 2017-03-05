/**
 * Created by lyt on 16-12-22.
 */
public class Square extends GeometricObject{
    private double length;
    private double width;

    public Square(){
        super();
    }

    public Square(double length,double width,String color,boolean filled){
        super(color,filled);
        //如果要调用父类的构造方法，必须在首行用super注明。

        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void printSquare(){
        System.out.println("This square is created in " + getDateCreated()
        + ",and length is " + getLength() + ",width is " + getWidth());
    }
}
