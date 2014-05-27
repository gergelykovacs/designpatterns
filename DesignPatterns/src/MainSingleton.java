/**
 * Singleton (single instance) main class.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.creational.singleton.Singleton;

public class MainSingleton {
	
	public MainSingleton() {
	}
	
	public static void main(String[] args) {
		// instantiation is only by its factory method
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.setName("The One");
		
		// s1 equals s2 not just semantically, only 1 instance exists (referenses are equal)
		if(s1 == s2)  {
			System.out.println("s1 equals s2");
		}
		// hence
		System.out.println("s1 is: "+ s1.getName() +", while s2 is: "+ s2.getName());
		
		// direct instantiation leads to compile error
		//Singleton s3 = new Singleton();
	}
}