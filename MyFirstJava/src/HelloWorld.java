
public class HelloWorld {
	
	public String wishMe(String name) {
		
		return "All the best!! "  + name ;
	}
	
	
	/*
	 * 
	 * static methods can be invoked without instantiating a class
	 */

	public static void main (String args[]) {
		
		HelloWorld hw = new HelloWorld() ;
		
		String result = hw.wishMe("Ganesh Sundarakrishnan");
		System.out.println(result);
		
	}

}
