package beverages.models;

import beverages.abstracts.Drink;

public class SweetTea extends Drink {
	
	public SweetTea(String color, Integer calories) {
		super(color, false, calories, 4);
	}

}
