package fruit;

public class Orange extends Fruit{

	public Orange(double weight, String color, String ripeness, String condition) {
		super(weight, color, ripeness, condition);
		
	}
	public Orange(double weight, String color, String ripeness, String condition,boolean peel) {
		super(weight, color, ripeness, condition,peel);
		
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Апельсин "+super.toString();
}
}
