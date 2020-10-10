
public class SellStockCommand implements Command{
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	public SellStockCommand(StockTrade stockTrade, String stockName, int shares ) {
		this.stockName = stockName;
		this.shares = shares;
		this.stockTrade = stockTrade;
	}
	
	public void execute() {
		stockTrade.sell(stockName, shares);
	}
}