package _06_Console_Store;

import javax.swing.JLabel;

public class SafetyHelmet extends NonFood {

	public SafetyHelmet() {
		price = 29.99;
		pieceCount=1;
		item = "Safety Helmet";
		
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
		return new JLabel(loadImage("safetyhelmet2.png"));
		
	}

}
