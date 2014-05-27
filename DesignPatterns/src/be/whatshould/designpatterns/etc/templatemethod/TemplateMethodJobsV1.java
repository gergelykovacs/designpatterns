/**
 * Specialization of the abstract Template Method pattern and the 
 * desired algorithms are implemented.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.templatemethod;

import be.whatshould.designpatterns.behavioral.templatemethod.TemplateMethodV1;

public class TemplateMethodJobsV1 extends TemplateMethodV1 {
	
	public TemplateMethodJobsV1() {
	}

	@Override
	public void jobA() {
		System.out.println("OK, job A is done.");
	}

	@Override
	public void jobB() {
		System.out.println("OK, job B is done.");
	}
}