/**
 * The object class is a deep copy candidate.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.prototype;

import be.whatshould.designpatterns.creational.prototype.ObjectCopy;

public class SquareCloneableV3 extends ObjectCopy {
	
	private String name = null;
	private int width = 0;
	
	public SquareCloneableV3() {
	}
	
	public SquareCloneableV3(String n) {
		name = n;
	}
	
	public SquareCloneableV3(int w) {
		width = w;
	}
	
	public SquareCloneableV3(String n, int w) {
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
		return super.copy();
	}
}