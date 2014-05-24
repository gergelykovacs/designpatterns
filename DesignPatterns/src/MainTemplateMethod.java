import be.whatshould.designpatterns.behavioral.TemplateMethodV1;
import be.whatshould.designpatterns.behavioral.TemplateMethodV2;
import be.whatshould.designpatterns.etc.TemplateMethodJobsV1;
import be.whatshould.designpatterns.etc.TemplateMethodJobsV2;

/**
 * Two special sub-job is executed inside the general template method 
 * procedure hence some part of the template method algorithm could 
 * be specialized.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
public class MainTemplateMethod {
	
	public MainTemplateMethod() {
	}
	
	public static void main(String[] args) {
		TemplateMethodV1 tm1 = new TemplateMethodJobsV1();
		TemplateMethodV2 tm2 = new TemplateMethodJobsV2();
		
		System.out.println("First specialization is executed:");
		tm1.templateMethod();
		
		System.out.println("\n\nSecond specialization is executed:");
		tm2.templateMethod();
	}
}