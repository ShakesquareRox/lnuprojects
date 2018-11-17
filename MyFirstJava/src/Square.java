
public class Square extends Rectangle {

	public Square(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public void setLength(int length) {
		this.length = length ;
		this.breadth = length ;
	}
	
	public void setBreadth(int breadth) {
		setLength(breadth) ;
	}
	
	public void test() {
		
	}
	
	public static void main(String args[]) {
		Square s= new Square("Yellow");
		s.setLength(20);
		//s.setBreadth(10);
		int area = s.calculateArea();
	
		System.out.println("The area is " + area );
	}
}
