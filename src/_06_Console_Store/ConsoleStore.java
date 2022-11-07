package _06_Console_Store;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import _02_Generics_Store.Cart;

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
	
	//TODO Add Ternary Operators, Images, And Scanners
	// To Add Scanners Make The Application Like a Beta And Use The Console To Message The User And Allow Them To Give Themselves More Money
	// To Add Ternary Operators Simply Use The Input From The Scanner And Change It To Zero If The Money Is Illogical/Negative
	//TODO Add Images By SHoing Them When Showing The Receipt
	protected JFrame frame = new JFrame();
	protected JPanel panel = new JPanel();
	protected JPanel panel2 = new JPanel();
	protected JButton addbutton = new JButton();
	protected JButton removebutton = new JButton();
	protected JButton viewbutton = new JButton();
	protected JButton checkbutton = new JButton();
	protected JTextField moneyDisplay = new JTextField(23);
	protected Timer update = new Timer(1000/60,this);
	protected Scanner input = new Scanner(System.in);
    List<NonFood> cart;
    double money;
    String name;
    
    protected void setup() {
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    	frame.setTitle("Online Depot");
    	frame.setSize(1050,150);
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
    	name = JOptionPane.showInputDialog("What Is Your Account Name?\n 10 Characters Maximum");
    	moneyDisplay.setVisible(true);
    	moneyDisplay.setEditable(false);
    	moneyDisplay.setText("Your Account: "+ name+ "   Balance: $"+ money);
    	cart = new ArrayList<NonFood>();
    	update.start();
    }
    public static void main(String[] args) {
       ConsoleStore runner = new ConsoleStore();
       runner.setup();
       System.out.println("Thank You "+runner.name+" For Joining");
       System.out.println("Welcome To The Online Depot Beta");
       System.out.println("We Are Glad To Have You Test A Smaller Version Of Our New Store");
       System.out.println("As This Is A Beta You Can Test All Elements For Bugs And Errors");
       System.out.println("You Can Also Give Yourselves Fake Credits To Test With");
       System.out.println("As For Adding Them Please Keep It Positive And Also Keep Decimals Short");
       runner.betaMoneyAdd();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(addbutton)) {
			String[] options = {"Safety Helmet", "Tool Box", "Deluxe Tool Box", "Quick Fix Kit"};
			int x = JOptionPane.showOptionDialog(null, "Choose An Item To Add", "Add Item To Cart", JOptionPane.INFORMATION_MESSAGE, 1, null, options, options[0]);
			if(x==0) {
				cart.add(new SafetyHelmet());
			}
			else if(x==1) {
				cart.add(new ToolBox());
			}
			else if(x==2) {
				cart.add(new DeluxeToolBox());
			}
			else if(x==3) {
				cart.add(new QuickFixKit());
			}
		}
		if(e.getSource().equals(removebutton)) {
			if(cart.size()>0) {
				int index = 0;
				String printout = "";
						do{
							printout = printout + cart.get(index).getItem()+": Item "+index+"\n";
							index++;
						}while(index<cart.size());
						printout = printout+"Choose One Item To Remove (Using Item ID Number)";
	       String remove = JOptionPane.showInputDialog(null, printout, "Remove Item From Cart", 1);
	       int removeindex = Integer.parseInt(remove);
	       cart.remove(removeindex);
				}
				else {
					JOptionPane.showInternalMessageDialog(null, "Please Add Items To Your Cart Before Removing", "Cart Error", 0, null);
				}
		}
		if(e.getSource().equals(viewbutton)) {
			if(cart.size()>0) {
			int index = 0;
			String printout = "";
					do{
						printout = printout + cart.get(index).getItem()+"\n";
						index++;
					}while(index<cart.size());
        JOptionPane.showMessageDialog(null, printout, "Your Cart", 1, null);
			}
			else {
				JOptionPane.showInternalMessageDialog(null, "Please Add Items To Your Cart Before Viewing", "Cart Error", 0, null);
			}
		}
		if(e.getSource().equals(checkbutton)) {
if(cart.size()>0) {
	int cancel = JOptionPane.showConfirmDialog(null, "Are You Sure To Check Out?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
	if(cancel==0) {
			double total = 0.0;
for (int i = 0; i < cart.size(); i++) {
	total = total + cart.get(i).getPrice();
}
if(total>money) {
	int index = 0;
	String printout = "";
	do{
		printout = printout + cart.get(index).getItem()+": $"+cart.get(index).getPrice()+": Item "+index+"\n";
		index++;
	}while(index<cart.size());
	printout = printout+"Choose One Item To Remove (Using Item ID Number)";
	String remove = JOptionPane.showInputDialog(null, "Please Remove An Item To Balance Cost\n"+"Total Cost: "+total+"    Money: "+money+"\n"+printout, "Cart Error", 0);
	 int removeindex = Integer.parseInt(remove);
     cart.remove(removeindex);
     JOptionPane.showInternalMessageDialog(null, "Please Check Out Again", "Item Removal Finishing", 0, null);
}
else {
	money = money-total;
	int index = 0;
	String printout = "";
	do{
		printout = printout + cart.get(index).getItem()+": $"+cart.get(index).getPrice()+"\n";
		index++;
	}while(index<cart.size());
	String formMoney = String.format("%.2f", money);
	String formTotal = String.format("%.2f", total);
	printout= "Receipt\n"+printout+"Total Cost: "+formTotal+"\nRemaining Balance: "+formMoney+"\nAccount Name: "+name+"\nThank You For Shopping At Online Depot\nHave A Great Day!";
	JOptionPane.showMessageDialog(null, printout);
	cart.removeAll(cart);
	money=Double.parseDouble(formMoney);
}
	}
	else {
		
	}
}
else {
	JOptionPane.showInternalMessageDialog(null, "Please Add Items To Your Cart Before Buying", "Cart Error", 0, null);
}
		}
		if(e.getSource().equals(update)){
			moneyDisplay.setText("Your Account: "+ name+ "   Balance: $"+ money);
		}
	}
	protected void betaMoneyAdd() {
		System.out.println("How Much Money Do You Want To Add?");
		double add = input.nextDouble();
		add=add<0.0 ? 0 : add;
		String formAdd = String.format("%.2f", add);
		add= Double.parseDouble(formAdd);
		money = money + add;
		System.out.println("");
		betaMoneyAdd();
	}
    @SuppressWarnings("rawtypes")
    public static ImageIcon loadImage(String fileName) {
        try {
            return new ImageIcon(ImageIO
                    .read(new Cart().getClass().getResourceAsStream("images/"+fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
	//public double caclulateTax(NonFood obj) {
	//	if(obj.getTotalPieceCount()>49) {
	//	int rate = obj.getTotalPieceCount()/10;
	//	return obj.getPrice()+rate;
	//	}
	//	else {
	//		return obj.getPrice();
	//	}
	//}

}
