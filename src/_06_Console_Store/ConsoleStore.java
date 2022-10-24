package _06_Console_Store;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConsoleStore implements ActionListener {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JButton addbutton = new JButton();
	JButton removebutton = new JButton();
	JButton viewbutton = new JButton();
	JButton checkbutton = new JButton();
    JTextField moneyDisplay = new JTextField();
    ArrayList<NonFood> cart;
    double money;
    String name;
    
    protected void setup() {
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    	frame.setTitle("Online Depot");
    	frame.setSize(1050,250);
    	frame.add(panel2);
    	frame.add(panel);
    	panel.add(moneyDisplay);
    	panel.add(addbutton);
    	panel.add(removebutton);
    	panel.add(viewbutton);
    	panel.add(checkbutton);
    	money = 250.00;
    	addbutton.addActionListener(this);
    	removebutton.addActionListener(this);
    	viewbutton.addActionListener(this);
    	checkbutton.addActionListener(this);
    	addbutton.setText("Add An Item To Your Cart");
    	removebutton.setText("Remove And Item From Your Cart");
    	viewbutton.setText("View Your Cart");
    	checkbutton.setText("Proceed To Checkout");
    	name = JOptionPane.showInputDialog("What Is Your Account Name?");
    	moneyDisplay.setVisible(true);
    	moneyDisplay.setEditable(false);
    	moneyDisplay.setText("Your Account: "+ name+ "   Balance: $"+ money);
    }
    public static void main(String[] args) {
       ConsoleStore runner = new ConsoleStore();
       runner.setup();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(addbutton)) {
			
		}
		if(e.getSource().equals(removebutton)) {
			
		}
		if(e.getSource().equals(viewbutton)) {
			
		}
		if(e.getSource().equals(checkbutton)) {
			
		}
	}
	public double caclulateTax(NonFood obj) {
		if(obj.getTotalPieceCount()>49) {
		int rate = obj.getTotalPieceCount()/25;
		return obj.getPrice()+rate*3;
		}
		else {
			return obj.getPrice();
		}
	}

}
