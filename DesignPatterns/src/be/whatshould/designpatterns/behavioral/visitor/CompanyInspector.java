/**
 * The wrapper for all the company inspectors.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.behavioral.visitor;

import be.whatshould.designpatterns.etc.visitor.Headquarters;
import be.whatshould.designpatterns.etc.visitor.DepartmentA;
import be.whatshould.designpatterns.etc.visitor.DepartmentB;

public interface CompanyInspector {
	
	public void visit(Headquarters hq);
	public void visit(DepartmentA departmentA);
	public void visit(DepartmentB departmentB);
}