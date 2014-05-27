/**
 * A concrete product implementation.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.factorymethod;

import be.whatshould.designpatterns.creational.factorymethod.ProductInterface;

public class ProductB implements ProductInterface {
	
	private static String name = ProductB.class.getCanonicalName();
	
	public ProductB() {
	}
	
	public String getName() {
		return name;
	}
}