package dataTypesModule2;
import java.util.ArrayList;
import java.util.Collections;


public class shoppingBasket {
	public static void main(String[] args) {
		
			ArrayList<String> shoppingBasket = new ArrayList<String>();
			
			
			shoppingBasket.add("milk");
			shoppingBasket.add("cereals");
			shoppingBasket.add("apples");
			shoppingBasket.add("oranges");
			shoppingBasket.add("bread");
			System.out.println(shoppingBasket.size()); 
			System.out.println(shoppingBasket.get(0));
			shoppingBasket.remove("bread");
			shoppingBasket.remove(2);
			
			shoppingBasket.add("potatoes");
			shoppingBasket.add("olive oil");
			shoppingBasket.add("chicken");
			Collections.sort(shoppingBasket);
			System.out.println(shoppingBasket.get(0) + " " + shoppingBasket.get(shoppingBasket.size() - 1));
			}
}


