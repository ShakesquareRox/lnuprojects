
public class Person {
	
	/*
	 * classes will have attributes and methods.
	 */
	
	private String name ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void describe() {
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My sex is " + sex);
	}
	
	// private variables can not be accessed outside the class
	
	private String sex ;
	private int age ;
	
	public static void main(String args[]) {
		Person actor = new Person() ;
		actor.setAge(44);
		actor.setName("PrakashRaj");
		actor.setSex("Male");
		actor.describe();
		
		
	}
	
	

}
