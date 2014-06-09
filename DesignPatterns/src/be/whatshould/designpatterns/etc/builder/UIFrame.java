/**
 * The UI Frame wrapper. Hierarchy of children will not be 
 * used for simplicity.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.builder;

public interface UIFrame {
	
	public void getType();
	public void getContent();
}