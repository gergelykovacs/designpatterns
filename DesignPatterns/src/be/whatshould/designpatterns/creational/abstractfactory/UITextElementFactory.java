/**
 * Concrete Factory that knows how to create `Text type` UI elements.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.abstractfactory;

import be.whatshould.designpatterns.etc.*;
import be.whatshould.designpatterns.etc.abstractfactory.UIButton;
import be.whatshould.designpatterns.etc.abstractfactory.UIEditText;
import be.whatshould.designpatterns.etc.abstractfactory.UITextClock;
import be.whatshould.designpatterns.etc.enums.UIElements;


class UITextElementFactory extends AbstractFactory {
	
	public UITextElementFactory() {
	}

	@Override
	public AbstractUITextElement createTextElement(UIElements e) {
		if(e == UIElements.BUTTON) {
			return new UIButton();
		} else if(e == UIElements.EDIT_TEXT) {
			return new UIEditText();
		} else if(e == UIElements.TEXT_CLOCK) {
			return new UITextClock();
		} else {
			return null;
		}
	}

	@Override
	public AbstractUINonTextElement createNonTextElement(UIElements e) {
		return null;
	}
}