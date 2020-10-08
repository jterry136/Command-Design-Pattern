/**
 * 
 * @author annetumlin
 *
 */
import java.util.*;
public class Agent {
	
	private ArrayList<Command> orders;
	
	/**
	 * Initializes the ArrayList orders
	 */
	public Agent() {
		orders = new ArrayList<Command>();
	}
	
	/**
	 * Adds the command to the ArrayList orders
	 * @param command The command to adds to the ArrayList
	 */
	public void placeOrder(Command command) {
		orders.add(command);
	}
	
	/**
	 * Loops through the list of orders and executes each command
	 */
	public void processOrders() {
		for(int i = 0; i < orders.size(); i++) {
			orders.get(i).execute();
		}
	}
}

