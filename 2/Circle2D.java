public class Circle2D {
	double x;
	double y;
	double radius;
	
	Circle2D(){
		x = 0;
		y = 0;
		radius = 1;
	}
	
	Circle2D(double a,double b,double c)
	{
		this.x = a;
		this.y = b;
		this.radius = c;
	}
	
	double getArea(){
		return (3.14*radius*radius);
	}
	
	double getPerimeter(){
		return (2*3.14*radius);
	}

    boolean contains(double x,double y){
        double s;
        s = Math.pow((Math.pow((y-this.y),2) + Math.pow((x-this.x),2)),0.5);
        if(s <= this.radius){
            return true;
        }
        return false;
    }

    boolean contains(Circle2D circle){
        double s;
        s = Math.pow((Math.pow((circle.y-this.y),2) + Math.pow((circle.x-this.x),2)),0.5);
        if(s <= Math.abs(this.radius-circle.radius))
            return true;
        return false;
    }


    boolean overlaps(Circle2D circle){
        double s;
        s = Math.pow((Math.pow((circle.y-this.y),2) + Math.pow((circle.x-this.x),2)),0.5);
        if(s >= Math.abs(this.radius-circle.radius) && s <= (this.radius+circle.radius))
            return true;
        return false;
    }
	
    public static void main(String args[]){
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        System.out.println(c1.contains(3,3));
        System.out.println(c1.contains(new Circle2D(4,5,10.5)));
        System.out.println(c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
