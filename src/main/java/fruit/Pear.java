package fruit;

public class Pear extends Fruit{

	public Pear(double weight, String color, String ripeness, String condition) {
		super(weight, color, ripeness, condition);
		
	}
	public  Pear(double weight, String color, String ripeness, String condition,boolean peel) {
		super(weight, color, ripeness, condition,peel);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Груша "+ super.toString();
	}

}
