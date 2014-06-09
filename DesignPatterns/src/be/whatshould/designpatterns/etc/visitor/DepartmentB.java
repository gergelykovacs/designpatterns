/**
 * The department behaviour when the inspector comes it accepts 
 * and let him/her to visit what is necessary.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.visitor;

import be.whatshould.designpatterns.behavioral.visitor.Company;
import be.whatshould.designpatterns.behavioral.visitor.CompanyInspector;

public class DepartmentB implements Company {
	
	private static final String NAME = "Department[B] of Trusted Company";
	
	public DepartmentB() {
	}

	@Override
	public void accept(CompanyInspector inspector) {
		inspector.visit(this);
	}

	@Override
	public String getName() {
		return NAME;
	}
}