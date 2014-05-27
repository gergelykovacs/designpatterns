/**
 * Only a single instance is allowed to be created by its `getInstance` 
 * factory method which is a Class method and the class stores its 
 * reference itself.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.singleton;

public class Singleton {
	
	private static Singleton instance;
	
	private String name = Singleton.class.getCanonicalName();
	
	// Constructor must be private.
	private Singleton() {
	}
	
	// The factory method.
	public static final Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	// Other methods or inner classes that can do some job.
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
}