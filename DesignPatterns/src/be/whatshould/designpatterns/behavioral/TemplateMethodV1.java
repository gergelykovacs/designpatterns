/**
 * Template Method pattern encapsulates a general algorithm with some 
 * sub-algorithms that are allowed to be overridden or asked to be implemented.
 *   
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral;

abstract public class TemplateMethodV1 {
	
	public TemplateMethodV1() {
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

	/**
	 * Virtual methods must be implemented that as specialization.
	 */
	abstract public void jobA();
	abstract public void jobB();
}