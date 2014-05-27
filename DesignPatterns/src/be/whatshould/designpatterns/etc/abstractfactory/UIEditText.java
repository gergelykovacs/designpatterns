/**
 * A simple UI EditText element that can be created.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.abstractfactory;

import be.whatshould.designpatterns.creational.abstractfactory.AbstractUITextElement;

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