package _06_Console_Store;

import javax.swing.JLabel;

public class ToolBox extends NonFood {

	public ToolBox() {
		price = 44.99;
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
	@Override
	public String getItem() {
		return item;
	}
	public JLabel loadImage() {
		return new JLabel(loadImage("toolbox2.png"));
		
	}

}
