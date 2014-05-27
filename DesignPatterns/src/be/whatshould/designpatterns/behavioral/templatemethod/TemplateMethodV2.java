/**
 * Template Method pattern encapsulates a general algorithm with some 
 * sub-algorithms that are allowed to be overridden or asked to be implemented.
 *   
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.templatemethod;

public class TemplateMethodV2 {
	
	public TemplateMethodV2() {
	}

	/**
	 * Fixed, global algorithm is performed by the template method 
	 * but some of the sub-algorithms are asked to be implemented by the developer 
	 * to better fit to the actual problem. 
	 */
	public final void templateMethod() {
		System.out.println("PreJob is done.");
		System.out.println("Expecting job A");
		jobA();
		System.out.println("Expecting job B");
		jobB();
		System.out.println("PostJob is done.");
	}
	
	// Default algorithm (A) that is allowed to be called, extended or overridden.
	public void jobA() {
		System.out.println("Default job for A.");
	}
	
	// Default algorithm (B) that is allowed to be called, extended or overridden.
	public void jobB() {
		System.out.println("Default job for B.");
	}
}