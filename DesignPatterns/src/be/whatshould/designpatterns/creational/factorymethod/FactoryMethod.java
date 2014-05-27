/**
 * The concrete factory method that knows which product should be created.
 * 
 * @author Gergely Kovacs  <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.creational.factorymethod;

import be.whatshould.designpatterns.creational.factorymethod.AbstractFactoryMethod;
import be.whatshould.designpatterns.etc.*;
import be.whatshould.designpatterns.etc.enums.ProductTypes;
import be.whatshould.designpatterns.etc.factorymethod.ProductA;
import be.whatshould.designpatterns.etc.factorymethod.ProductB;
import be.whatshould.designpatterns.etc.factorymethod.ProductC;

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