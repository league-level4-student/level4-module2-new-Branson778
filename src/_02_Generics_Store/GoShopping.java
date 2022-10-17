package _02_Generics_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//done
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
		//Cart<Candy> cart1 = new Cart<Candy>();
		// 3. Create another Cart object of type Cereal
		//Cart<Cereal> cart2 = new Cart<Cereal>();
		// 4. Add a few items to EACH cart
		//cart1.add(new Candy());
		//cart1.add(new Candy());
		//cart1.add(new Candy());
		//cart2.add(new Cereal());
		//cart2.add(new Cereal());
		// 5. Call the showCart() method on EACH cart
		//cart1.showCart();
		//cart2.showCart();
		// 6. Run the code
		//done
		// 7. Comment out the code you have so far
		//done
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		Cart<Clothing> cart3 = new Cart<Clothing>();
		Cart<Toy> cart4 = new Cart<Toy>();
		cart3.add(new Clothing());
		cart4.add(new Toy());
		cart4.add(new Toy());
		cart4.add(new Toy());
		cart4.add(new Toy());
		cart4.add(new Toy());
		cart3.showCart();
		cart4.showCart();
		// Why are there errors?
		//The Cart Type Only Extends Food And Not Non-Food
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				//done
		// 10. Run the code. Does it work?
		//yes
	}
}
