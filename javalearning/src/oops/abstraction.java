package oops;

abstract class Shape{
	abstract void draw() ;//declaration

}

class Circle extends Shape{

	void draw() {
		System.out.println("Drawing Circle");
	}
}


public class abstraction{

	public static void main(String[] args) {
		
		Shape s = new Circle();
		s.draw();
		
	}

}
