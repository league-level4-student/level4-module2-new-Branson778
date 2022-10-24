package _06_Console_Store;

public class DeluxeToolBox extends NonFood {
    public DeluxeToolBox() {
    	price=80.50;
    	pieceCount=750;
    	item = "Deluxe Tool Box";
    }
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public int getTotalPieceCount() {
		return pieceCount;
	}

}
