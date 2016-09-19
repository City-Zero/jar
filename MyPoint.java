
public class MyPoint {
	double x;
	double y;
	
	double x_get(){
		return this.x;
	}
	
	double y_get(){
		return this.y;
	}
	
	MyPoint(){
		this.x=0;
		this.y=0;
	}
	
	MyPoint(double a,double b){
		this.x=a;
		this.y=b;
	}
	
	double distance(MyPoint a){
		double s;
		s = Math.pow((Math.pow((a.y-this.y),2) + Math.pow((a.x-this.x),2)),0.5);
		return s;
	}

    double distance(double x,double y){
        double s;
		s = Math.pow((Math.pow((y-this.y),2) + Math.pow((x-this.x),2)),0.5);
        return s;
    }
	
	public static void main(String[] args) {
		MyPoint a = new MyPoint();
		MyPoint b = new MyPoint(10,30.5);
		
		System.out.println(b.distance(a));
		System.out.println(b.distance(10,20));
	}

}


