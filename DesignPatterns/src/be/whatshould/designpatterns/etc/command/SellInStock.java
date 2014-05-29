/**
 * The representation knows exactly which command should be executed.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.command;

import be.whatshould.designpatterns.behavioral.command.CommandInterface;

public class SellInStock implements CommandInterface {
	
	private Stock stock = null;
	
	public SellInStock(Stock s) {
		stock = s;
	}

	@Override
	public void execute() {
		stock.sell();
	}
}
