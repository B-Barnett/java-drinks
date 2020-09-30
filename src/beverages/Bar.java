package beverages;

import java.util.ArrayList;

import beverages.abstracts.Drink;
import beverages.models.Coffee;
import beverages.models.SweetTea;
import beverages.models.Whiskey;

public class Bar {
	
	public static void main(String... args) {
		Drink d1 = new SweetTea("brown", 200);
		d1.consume();
		d1.temperature += 70;
		d1.consume();
		Coffee c1 = new Coffee("Beige", 125, 88, "arabica");
		c1.consume();
		c1.temperature -= 29;
		c1.consume();
		Whiskey w1 = new Whiskey("golden brown", 50, 20, 45d);
		w1.consume();
		ArrayList<Drink> menu = new ArrayList<Drink>();
		menu.add(d1);
		menu.add(c1);
		menu.add(w1);
	}

}
