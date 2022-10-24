package _06_Console_Store;

public class ToolBox extends NonFood {

	public ToolBox() {
		price = 40.25;
		pieceCount = 350;
		item="Tool Box";
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
