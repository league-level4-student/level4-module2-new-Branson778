package _06_Console_Store;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import _02_Generics_Store.Cart;

public abstract class NonFood {
    String item;
    protected double price;
    protected int pieceCount;
    public abstract double getPrice();
    public abstract int getTotalPieceCount();
    public abstract String getItem();
    
	@SuppressWarnings("rawtypes")
	public static ImageIcon loadImage(String fileName) {
		try {
			return new ImageIcon(ImageIO.read(new ConsoleStore().getClass().getResourceAsStream("images/"+fileName)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	


    public abstract JLabel loadImage();
}
