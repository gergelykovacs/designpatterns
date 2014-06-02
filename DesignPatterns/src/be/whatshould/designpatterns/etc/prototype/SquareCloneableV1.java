/**
 * The class is a `shallow` cloneable object candidate.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.prototype;

public class SquareCloneableV1 implements Cloneable {
	
	public String name = null;
	public int width = 0;
	
	public SquareCloneableV1() {
	}
	
	public SquareCloneableV1(String n) {
		name = n;
	}
	
	public SquareCloneableV1(int w) {
		width = w;
	}
	
	public SquareCloneableV1(String n, int w) {
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
	public Object clone() {
		try {
			return super.clone();
		} catch(CloneNotSupportedException e) {
			return null;
		}
	}
}