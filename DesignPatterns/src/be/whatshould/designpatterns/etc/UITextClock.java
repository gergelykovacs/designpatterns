package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.creational.AbstractUITextElement;

public class UITextClock extends AbstractUITextElement {
	
	private String text;
	
	public UITextClock() {
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