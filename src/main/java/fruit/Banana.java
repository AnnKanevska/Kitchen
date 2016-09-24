package fruit;

public class Banana extends Fruit{

	public Banana(double weight, String color, String ripeness, String condition) {
		super(weight, color, ripeness, condition);
		
	}
	public Banana(double weight, String color, String ripeness, String condition,boolean peel) {
		super(weight, color, ripeness, condition,peel);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Банан "+super.toString();
	}
}
