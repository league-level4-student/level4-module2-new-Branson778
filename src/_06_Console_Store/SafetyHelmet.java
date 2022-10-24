package _06_Console_Store;

public class SafetyHelmet extends NonFood {

	public SafetyHelmet() {
		price = 29.99;
		pieceCount=1;
		
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
