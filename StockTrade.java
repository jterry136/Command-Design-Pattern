/**
 * This class describes a stock trade made on the stock market
 * @author Jonathan Terry
 *
 */
public class StockTrade {
	
	/**
	 * An empty constructor. Allows the program to create an instance of this class.
	 */
	public StockTrade() {
		
	}
	
	/**
	 * This method prints a string notifying users how many shares of a stock they are buying
	 * @param stockName:  A string describing the name of the stock
	 * @param numShares: An integer describing the number of shares the user is buying 
	 */
	public void buy(String stockName, int numShares) {
		System.out.println("Buying " + numShares + " of " + stockName);
	}
	
	/**
	 * This method prints a string notifying users how many shares of a stock they are selling
	 * @param stockName:  A string describing the name of the stock
	 * @param numShares: An integer describing the number of shares the user is selling 
	 */
	public void sell(String stockName, int numShares) {
		System.out.println("Selling " + numShares + " of " + stockName);
	}

}
