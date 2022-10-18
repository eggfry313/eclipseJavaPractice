package abstractPackage;

abstract class Shape {

	double pi = 3.14;

	abstract void draw();

	public double findArea() {
		return 0.0;
	}
}

class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	void draw() {
		System.out.println("원을 그리다");
	}
	public double findArea() {
		return pi * radius * radius;
	}
}

public class AbstractClassDemo {
	public static void main(String[] args) {
//		Shape s = new Shape();
		
		Circle c = new Circle(10);
		c.draw();
		System.out.println("반지름 : "+c.radius);
		System.out.printf("원의 넓이는 %.1f\n\n",c.findArea());
		
		Shape s = new Circle(20);
		s.draw();
//		System.out.println("반지름 : "+s.radius);
		System.out.printf("도형의 넓이는 %.1f\n",s.findArea());
	}
}
