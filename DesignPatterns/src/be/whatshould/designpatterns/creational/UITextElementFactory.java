package be.whatshould.designpatterns.creational;

import be.whatshould.designpatterns.etc.*;


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