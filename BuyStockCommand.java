/**
 * This class will allow the user to buy a stock from the stock trade.
 * @author terric
 * 
 */
public class BuyStockCommand implements Command{
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	public BuyStockCommand(StockTrade stockTrade, String stockName, int shares ) {
		this.stockName = stockName;
		this.shares = shares;
		this.stockTrade = stockTrade;
	}
	/**
	 * This method will create a new instance of stock.
	 * from there the buy method from StockTrade is called and passes in two parameters.
	 * @param stockName: String value describing the name of a stock.
	 * @param shares: integer value of the number of shares a user is buying.
	 */
	public void execute() {
		stockTrade.buy(stockName, shares);
	}
}
