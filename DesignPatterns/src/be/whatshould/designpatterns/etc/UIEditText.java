package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.creational.AbstractUITextElement;

public class UIEditText extends AbstractUITextElement {
	
	private String text;
	
	public UIEditText() {
	}

	@Override
	public void setText(String t) {
		text = t;
	}

	@Override
	public String getText() {
		return text;
	}	
}