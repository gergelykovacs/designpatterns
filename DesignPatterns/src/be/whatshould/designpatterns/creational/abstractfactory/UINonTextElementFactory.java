/**
 * Concrete Factory that knows how to create `Non-Text type` UI elements.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.abstractfactory;

import be.whatshould.designpatterns.etc.*;
import be.whatshould.designpatterns.etc.abstractfactory.UIImageView;
import be.whatshould.designpatterns.etc.abstractfactory.UISurfaceView;
import be.whatshould.designpatterns.etc.enums.UIElements;


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