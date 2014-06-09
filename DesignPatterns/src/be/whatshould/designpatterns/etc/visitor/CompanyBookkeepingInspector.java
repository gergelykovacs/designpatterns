/**
 * The concrete visitor or in the present example the inspector.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.visitor;

import be.whatshould.designpatterns.behavioral.visitor.CompanyInspector;
import be.whatshould.designpatterns.etc.visitor.DepartmentA;
import be.whatshould.designpatterns.etc.visitor.DepartmentB;
import be.whatshould.designpatterns.etc.visitor.Headquarters;

public class CompanyBookkeepingInspector implements CompanyInspector {
	
	public CompanyBookkeepingInspector() {
	}

	@Override
	public void visit(Headquarters hq) {
		System.out.println(hq.getName() +" has already been investigated.");
	}

	@Override
	public void visit(DepartmentA departmentA) {
		System.out.println(departmentA.getName() +" has already been investigated.");		
	}

	@Override
	public void visit(DepartmentB departmentB) {
		System.out.println(departmentB.getName() +" has already been investigated.");
	}
}