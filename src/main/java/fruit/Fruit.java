package fruit;

import plant.Plant;

public class Fruit extends Plant{

	public Fruit(double weight, String color, String ripeness, String condition) {
		super(weight, color, ripeness, condition);
		
	}
	public Fruit(double weight, String color, String ripeness, String condition,boolean peel) {
		super(weight, color, ripeness, condition,peel);
		
	}

	public void peel() {
		super.peel();
		setWeight(getWeight()-getWeight()*0.02);
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
}
