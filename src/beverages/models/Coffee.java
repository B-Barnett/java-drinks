package beverages.models;

import beverages.abstracts.Drink;

public class Coffee extends Drink {

	public String beans;
	
	public Coffee(String color, Integer calories, Integer temperature, String beans) {
		super(color, false, calories, temperature);
		this.beans = beans;
	}
	
}
