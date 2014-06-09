/**
 * Visitor pattern is demonstrated as an Inspector who goes to a company 
 * and walks through its departments to check whether the bookkeeping is 
 * OK or not.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.behavioral.visitor.Company;
import be.whatshould.designpatterns.etc.visitor.CompanyBookkeepingInspector;
import be.whatshould.designpatterns.etc.visitor.Headquarters;

public class MainVisitor {
	
	public MainVisitor() {
	}
	
	public static void main(String[] args) {
		
		Company trustedCompanyHQ = new Headquarters();
		trustedCompanyHQ.accept(new CompanyBookkeepingInspector());
	}
}