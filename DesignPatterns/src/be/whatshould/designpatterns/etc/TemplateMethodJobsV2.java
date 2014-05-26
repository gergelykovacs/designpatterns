/**
 * Specialization of the concrete Template Method pattern and the 
 * desired algorithms are implemented however in this case the 
 * Template Method is allowed to be instantiated directly.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.behavioral.TemplateMethodV2;

public class TemplateMethodJobsV2 extends TemplateMethodV2 {
	
	public TemplateMethodJobsV2() {
	}

	@Override
	public void jobA() {
		super.jobA();// Execute the default job at first. (optional)
		// Implementatin of the job (A) algorithm.
		System.out.println("OK, job A is done.");
	}

	@Override
	public void jobB() {
		super.jobB();// Execute the default job at first. (optional)
		// Implementation of the job (B) algorithm.
		System.out.println("OK, job B is done.");
	}
}