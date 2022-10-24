package _06_Console_Store;

public class BoxOfConnecters extends NonFood {
   public BoxOfConnecters(){
	   price = 45.65;
	   pieceCount = 1250;
	   item = "Box Of Connecters";
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
