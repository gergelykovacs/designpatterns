/**
 * A simple UI ImageView that can be created.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.abstractfactory;

import be.whatshould.designpatterns.creational.abstractfactory.AbstractUINonTextElement;

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