package beverages.models;

import beverages.abstracts.Drink;
import beverages.interfaes.IAlcohol;

public class Whiskey extends Drink implements IAlcohol {

	public Double abv;
	
	public Whiskey(String color, Integer calories, Integer temperature, Double abv) {
		super(color, false, calories, temperature);
		this.abv = abv;
	}
	
	public void consume() {
		System.out.println("sip sip...");
	}
	
	public Double getABV() {
		return abv;
	}
	
}
