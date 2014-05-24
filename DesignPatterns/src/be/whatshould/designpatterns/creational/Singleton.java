package be.whatshould.designpatterns.creational;

/**
 * Only a single instance is allowed to be created by its `getInstance` 
 * factory method which is a Class method.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
public class Singleton {
	
	private static Singleton instance;
	
	private String name = Singleton.class.getCanonicalName();
	
	private Singleton() {
	}
	
	public static final Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
}