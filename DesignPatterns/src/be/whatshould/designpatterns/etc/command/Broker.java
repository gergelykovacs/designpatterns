/**
 * The Broker registers all the intentions and if he or she is satisfied 
 * then the order can be placed.
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
package be.whatshould.designpatterns.etc.command;

import java.util.List;
import java.util.ArrayList;
import be.whatshould.designpatterns.behavioral.command.CommandInterface;

public class Broker {
	
	private List<CommandInterface> list = new ArrayList<CommandInterface>();
	
	public Broker() {
	}
	
	public void registerOrder(CommandInterface cmd) {
		list.add(cmd);
	}
	
	public void placeOrders() {
		for(CommandInterface cmd : list) {
			cmd.execute();
		}
		list.clear();
	}
}
