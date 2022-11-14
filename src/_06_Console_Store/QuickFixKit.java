package _06_Console_Store;

import javax.swing.JLabel;

public class QuickFixKit extends NonFood {
   public QuickFixKit(){
	   price = 45.99;
	   pieceCount = 1250;
	   item = "Quick Fix Kit";
   }
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public int getTotalPieceCount() {
		return pieceCount;
	}
	@Override
	public String getItem() {
		return item;
	}
	public JLabel loadImage() {
		return new JLabel(loadImage("quickfixkit2.png"));
		
	}

}
