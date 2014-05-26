/**
 * Two special sub-job is executed inside the general template method 
 * procedure hence some part of the template method algorithm could 
 * be specialized.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.behavioral.TemplateMethodV1;
import be.whatshould.designpatterns.behavioral.TemplateMethodV2;
import be.whatshould.designpatterns.etc.TemplateMethodJobsV1;
import be.whatshould.designpatterns.etc.TemplateMethodJobsV2;

public class MainTemplateMethod {
	
	public MainTemplateMethod() {
	}
	
	public static void main(String[] args) {
		// Three versions of the Template Method pattern is used.
		TemplateMethodV1 tm1 = new TemplateMethodJobsV1();
		TemplateMethodV2 tm2 = new TemplateMethodJobsV2();
		TemplateMethodV2 tm3 = new TemplateMethodV2();
		
		// Now the general algorithms are called with the apropriate specializations.
		System.out.println("First specialization is executed:");
		tm1.templateMethod();
		
		System.out.println("\n\nSecond specialization is executed:");
		tm2.templateMethod();
		
		// No specialization was done here.
		System.out.println("\n\nThird non-specialization is executed:");
		tm3.templateMethod();
	}
}