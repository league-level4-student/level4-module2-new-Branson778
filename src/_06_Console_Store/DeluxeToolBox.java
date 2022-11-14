package _06_Console_Store;

import javax.swing.JLabel;

public class DeluxeToolBox extends NonFood {
    public DeluxeToolBox() {
    	price=79.99;
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
	@Override
	public String getItem() {
		return item;
	}
	public JLabel loadImage() {
		return new JLabel(loadImage("deluxetoolbox2.png"));
		
	}

}
