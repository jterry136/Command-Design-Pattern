
public class BuyStockCommand {
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	public BuyStockCommand(StockTrade stockTrade, String stockName, int shares ) {
		stockName = this.stockName;
		shares = this.shares;
		stockTrade = this.stockTrade;
	}
	
	public void execute() {
		//needs to call buy command from StockTrade
	}
}
