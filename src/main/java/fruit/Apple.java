package fruit;

public class Apple extends Fruit{

	public Apple(double weight, String color, String ripeness, String condition) {
		super(weight, color, ripeness, condition);
		
	}
	public Apple(double weight, String color, String ripeness, String condition,boolean peel) {
		super(weight, color, ripeness, condition,peel);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Яблоко-"+super.toString();
	}

}
