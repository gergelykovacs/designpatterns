/**
 * A simple UI SurfaceView that can be created.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.abstractfactory;

import be.whatshould.designpatterns.creational.abstractfactory.AbstractUINonTextElement;

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