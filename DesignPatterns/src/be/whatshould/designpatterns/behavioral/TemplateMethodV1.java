package be.whatshould.designpatterns.behavioral;

abstract public class TemplateMethodV1 {
	
	public TemplateMethodV1() {
	}

	public final void templateMethod() {
		System.out.println("PreJob is done.");
		System.out.println("Expecting job A");
		jobA();
		System.out.println("Expecting job B");
		jobB();
		System.out.println("PostJob is done.");
	}
	
	abstract public void jobA();
	abstract public void jobB();
}