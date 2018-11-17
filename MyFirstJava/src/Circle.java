
public class Circle extends Shape {

	public Circle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		Circle c = new Circle("Red") ;
		System.out.println(c.getColor());
	}

}
