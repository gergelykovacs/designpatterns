/**
 * The company's HQ that collects all the departments, as well.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.visitor;

import java.util.List;
import java.util.ArrayList;
import be.whatshould.designpatterns.behavioral.visitor.Company;
import be.whatshould.designpatterns.behavioral.visitor.CompanyInspector;

public class Headquarters implements Company {
	
	private static final String NAME = "The Trusted Company's HQ";
	
	private List<Company> departments = new ArrayList<Company>();
	
	public Headquarters() {
		departments.add(new DepartmentA());
		departments.add(new DepartmentB());
	}

	@Override
	public void accept(CompanyInspector inspector) {
		for(Company d : departments) {
			d.accept(inspector);
		}
		inspector.visit(this);
	}

	@Override
	public String getName() {
		return NAME;
	}
}