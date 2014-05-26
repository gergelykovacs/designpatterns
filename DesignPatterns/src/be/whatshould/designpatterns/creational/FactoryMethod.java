/**
 * The concrete factory method that knows which product should be created.
 * 
 * @author Gergely Kovacs  <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational;

import be.whatshould.designpatterns.creational.AbstractFactoryMethod;
import be.whatshould.designpatterns.etc.*;

public class FactoryMethod extends AbstractFactoryMethod {
	
	public FactoryMethod() {
	}

	@Override
	protected ProductInterface factoryMethod(ProductTypes pt) {
		if(pt == ProductTypes.PRODUCT_A) {
			return new ProductA();
		} else if(pt == ProductTypes.PRODUCT_B) {
			return new ProductB();
		} else if(pt == ProductTypes.PRODUCT_C) {
			return new ProductC();
		} else {
			return null;
		}
	}
}