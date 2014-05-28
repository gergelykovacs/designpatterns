/**
 * A CRUD database handler will be used to demonstrate the Bridge pattern with
 * 		insert() 
 * 		query()
 * 		update()
 * 		delete()
 * functionalities that should work with e.g., some flavors of SQL so let call them 
 * HisSQL and HerSQL. Both the DBs have only one internal DB structure moreover only 
 * one Table so they should be thought as two same vectors with different languages 
 * they understand. (Sometimes it is a real life situation if one thinks to teenagers 
 * girls and boys while the DB abstraction is the school where they learn and the Implementor is 
 * the teacher who must know how to tell them the same thing on different ways.) 
 * 
 * @author Gergely Kovacs <anonymous.gergo@gmail.com>
 */
import be.whatshould.designpatterns.structural.bridge.*;
import be.whatshould.designpatterns.etc.enums.DBTypes;

public class MainBridge {
	
	public MainBridge() {
	}
	
	public static void main(String[] args) {
		
		// Connect to BrainDB of girls and fill up with some knowledge.
		DatabaseInterface db1 = new DatabaseConnection(DBTypes.HER_SQL);
		
		db1.insert("lecture1", "Pick a nice notebook.");
		db1.insert("lecture2", "Pick a beautiful pen.");
		db1.insert("lecture3", "Enjoy the lectures.");
		
		db1.update("lecture1", "Pick a useful notebook.");
		
		System.out.println("@Check out update: "+ db1.query("lecture1"));
		
		db1.delete("lecture3");
		
		// Connect to BrainDB of boys and fill up with some knowledge.
		DatabaseInterface db2 = new DatabaseConnection(DBTypes.HIS_SQL);
		
		db2.insert("lecture1", "Pick a notebook with Superman sticker.");
		db2.insert("lecture2", "Pick a cool pen.");
		db2.insert("lecture3", "Try to enjoy the lectures.");
		
		db2.update("lecture1", "Pick a notebook with Batman sticker.");
		
		System.out.println("@Check out update: "+ db2.query("lecture1"));
		
		db2.delete("lecture3");
	}
} 