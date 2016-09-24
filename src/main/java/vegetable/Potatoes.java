package vegetable;

public class Potatoes extends Vegetable{

	public Potatoes(double weight, String color, String ripeness,
			String condition) {
		super(weight, color, ripeness, condition);
		
	}

	public  Potatoes(double weight, String color, String ripeness, String condition, boolean peel) {
			super(weight, color, ripeness, condition,peel);
			
		}	
	

}
