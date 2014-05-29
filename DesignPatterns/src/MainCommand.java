/**
 * In order to demonstrate the Command pattern a Stock-Broker relationship 
 * is used.
 *  
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.etc.command.*;

public class MainCommand {
	
	public MainCommand() {
	}
	
	public static void main(String[] args) {
		
		Broker broker = new Broker();
		Stock stock = new Stock("Wall Street", 2, "Gold");
		
		broker.registerOrder(new BuyInStock(stock));
		broker.registerOrder(new SellInStock(stock));
		broker.registerOrder(new BuyInStock(stock));
		
		broker.placeOrders();
	}
}