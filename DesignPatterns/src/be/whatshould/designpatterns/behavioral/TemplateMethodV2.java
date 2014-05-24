package be.whatshould.designpatterns.behavioral;

public class TemplateMethodV2 {
	
	public TemplateMethodV2() {
	}

	public final void templateMethod() {
		System.out.println("PreJob is done.");
		System.out.println("Expecting job A");
		jobA();
		System.out.println("Expecting job B");
		jobB();
		System.out.println("PostJob is done.");
	}
	
	public void jobA() {
		System.out.println("Default job for A.");
	}
	
	public void jobB() {
		System.out.println("Default job for B.");
	}
}