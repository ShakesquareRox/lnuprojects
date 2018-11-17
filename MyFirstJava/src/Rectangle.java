
public class Rectangle extends Shape {
	int length,breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int calculateArea() {
		return length * breadth;
		
	}

	public Rectangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

}
