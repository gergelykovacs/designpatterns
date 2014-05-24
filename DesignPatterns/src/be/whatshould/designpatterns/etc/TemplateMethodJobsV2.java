package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.behavioral.TemplateMethodV2;

public class TemplateMethodJobsV2 extends TemplateMethodV2 {
	
	public TemplateMethodJobsV2() {
	}

	@Override
	public void jobA() {
		super.jobA();// I want to execute default job at first.
		// I implement my job here.
		System.out.println("OK, job A is done.");
	}

	@Override
	public void jobB() {
		super.jobB();// I want to execute default job at first.
		// I implement my job here.
		System.out.println("OK, job B is done.");
	}
}