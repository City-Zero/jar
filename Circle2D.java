
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
	

}
