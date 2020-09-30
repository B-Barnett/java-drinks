package beverages.abstracts;

public abstract class Drink {
	
	public String color;
	public Boolean isCarbonated;
	public Integer calories;
	public Integer temperature;
	
	public Drink(String color, Boolean isCarbonated, Integer calories, Integer temperature) {
		this.color = color;
		this.isCarbonated = isCarbonated;
		this.calories = calories;
		this.temperature = temperature;
	}
	
	public void consume() {
		if(temperature > 60) {
			System.out.println("sip sip...");
		} else {
			System.out.println("glug glug...");
		}
	}
	
	
}
