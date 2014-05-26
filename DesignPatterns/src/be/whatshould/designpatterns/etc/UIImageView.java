package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.creational.AbstractUINonTextElement;

public class UIImageView extends AbstractUINonTextElement {
	
	private String name;
	
	public UIImageView() {
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