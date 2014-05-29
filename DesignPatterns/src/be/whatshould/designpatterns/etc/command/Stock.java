/**
 * A simple representation of the Stock where one can buy or sell units of items.
 * 
 * @author gkovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.command;

public class Stock {
	
	private String name;
	private String what;
	private int unit;
	
	public Stock(String n, int u, String w) {
		name = n;
		unit = u;
		what = w;
	}
	
	public void buy() {
		System.out.println("@Bought [ Unit: "+ unit +", What: "+ what +", Where: "+ name +" ]");
	}
	
	public void sell() {
		System.out.println("#Sold [ Unit: "+ unit +", What: "+ what +", Where: "+ name +" ]");
	}
}