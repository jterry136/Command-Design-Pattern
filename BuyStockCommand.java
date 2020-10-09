/**
 * This class will allow the user to buy a stock from the stock trade.
 * @author terric
 * @param <StockTrade>
 * 
 */
public class BuyStockCommand {
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	public BuyStockCommand(StockTrade stockTrade, String stockName, int shares ) {
		stockName = this.stockName;
		shares = this.shares;
		stockTrade = this.stockTrade;
	}
	/**
	 * This method will create a new instance of stock.
	 * from there the buy method from StockTrade is called and passes in two parameters.
	 * @param stockName: String value describing the name of a stock.
	 * @param shares: integer value of the number of shares a user is buying.
	 */
	public void execute() {
		StockTrade stock = new StockTrade();
		stock.buy(stockName, shares);
	}
}
