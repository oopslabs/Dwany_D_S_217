package CO5;


interface shape
{
	double area();
	double perimeter();
}

class circle implements shape{
	int r;
	circle(int r){
		this.r=r;
	}
	public double area() {
		return(3.14*r*r);
	}
	public double perimeter() {
		return(3.14*2*r);
	}
}

class triangle implements shape{
	int l,b,h;
	triangle(int l,int b,int h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public double area() {
		return(.5*l*b*h);
	}
	public double perimeter() {
		return((1/2)*(l+b+h));
	}
}


public class exam {

	public static void main(String [] args) {
		circle c=new circle(5);
		System.out.println("Circle\nArea : "+c.area()+"\nPerimeter : "+c.perimeter());
		triangle r=new triangle(5,2,2);
		System.out.println("\nTrinagle\nArea : "+r.area()+"\nPerimeter : "+r.perimeter());
	}
}
