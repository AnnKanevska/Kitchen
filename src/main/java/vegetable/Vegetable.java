package vegetable;

import plant.Plant;

public class Vegetable extends Plant{

	public Vegetable(double weight, String color, String ripeness,
			String condition) {
		super(weight, color, ripeness, condition);
		
	}

	public Vegetable(double weight, String color, String ripeness, String condition, boolean peel) {
		super(weight, color, ripeness, condition,peel);
		
	}	
	
	public void peel() {
		super.peel();
		setWeight(getWeight()-getWeight()*0.05);
	}

}
