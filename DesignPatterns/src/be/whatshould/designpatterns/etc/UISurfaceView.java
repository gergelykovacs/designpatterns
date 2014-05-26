package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.creational.AbstractUINonTextElement;

public class UISurfaceView extends AbstractUINonTextElement {
	
	private String name;
	
	public UISurfaceView() {
	}

	@Override
	public void setName(String n) {
		name = n;
	}

	@Override
	public String getName() {
		return name;
	}
}