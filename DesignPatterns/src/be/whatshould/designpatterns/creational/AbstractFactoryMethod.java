/**
 * Wraps the creation procedure with its abstract factory method that must be 
 * specified elsewhere but it may contain fixed methods, procedures that can 
 * do some jobs.  
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational;

import be.whatshould.designpatterns.creational.ProductInterface;
import be.whatshould.designpatterns.etc.ProductTypes;

public abstract class AbstractFactoryMethod {
	
	public void printName(ProductTypes pt) {
		System.out.println("Product name is: "+ factoryMethod(pt).getName());
	}
	
	protected abstract ProductInterface factoryMethod(ProductTypes pt);
}