/**
 * A concrete product implementation.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.factorymethod;

import be.whatshould.designpatterns.creational.factorymethod.ProductInterface;

public class ProductC implements ProductInterface {
	
	private static String name = ProductB.class.getCanonicalName();
	
	public ProductC() {
	}
	
	public String getName() {
		return name;
	}
}