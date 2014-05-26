package be.whatshould.designpatterns.creational;

import be.whatshould.designpatterns.etc.*;


class UINonTextElementFactory extends AbstractFactory {
	
	public UINonTextElementFactory() {
	}

	@Override
	public AbstractUITextElement createTextElement(UIElements e) {
		return null;
	}

	@Override
	public AbstractUINonTextElement createNonTextElement(UIElements e) {
		if(e == UIElements.IMAGE_VIEW) {
			return new UIImageView();
		} else if(e == UIElements.SURFACE_VIEW) {
			return new UISurfaceView();
		} else {
			return null;
		}
	}
}