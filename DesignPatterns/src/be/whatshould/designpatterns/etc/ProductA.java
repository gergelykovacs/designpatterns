/**
 * A concrete product implementation.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc;

import be.whatshould.designpatterns.creational.ProductInterface;

public class ProductA implements ProductInterface {
	
	private static String name = ProductB.class.getCanonicalName();
	
	public ProductA() {
	}
	
	public String getName() {
		return name;
	}
}