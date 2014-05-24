package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.behavioral.TemplateMethodV1;

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