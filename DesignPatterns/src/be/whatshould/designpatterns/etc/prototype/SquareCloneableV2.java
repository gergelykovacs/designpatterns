/**
 * The class is a `hand-made` cloneable object candidate.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.prototype;

import be.whatshould.designpatterns.creational.prototype.PrototypeInterface;

public class SquareCloneableV2 implements PrototypeInterface {
	
	public String name = null;
	public Integer width = null;
	
	public SquareCloneableV2() {
	}
	
	public SquareCloneableV2(String n) {
		name = n;
	}
	
	public SquareCloneableV2(int w) {
		width = w;
	}
	
	public SquareCloneableV2(String n, int w) {
		name = n;
		width = w;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWidth() {
		return width;
	}

	@Override
	public Object copy() {
		try {
			if(name == null || width == null) {
				throw new CloneNotSupportedException();
			}
			Object o = new SquareCloneableV2(name, width);
			return o;
		} catch(CloneNotSupportedException e) {
			return null;
		}
	}
}