package plant;

public abstract class Plant implements Peellable{
 private double weight;
 private String color;
 private String ripeness;
 private String condition;
 private boolean peel=false;
 
 public Plant(double weight,String color,String ripeness,String condition) {
	 this.weight=weight;
	 this.color=color;
	 this.ripeness=ripeness;
	 this.condition= condition;
}
 public Plant(double weight,String color,String ripeness,String condition,boolean peel) {
	 this.weight=weight;
	 this.color=color;
	 this.ripeness=ripeness;
	 this.condition= condition;
	 this.peel=peel;
}public Plant() {
	// TODO Auto-generated constructor stub
}

  public double getWeight() {
	return weight;
}
  public boolean getPeel() {
		return peel;
	}
   
  public void setWeight(double weight) {
	this.weight = weight;
}
 public void peel() {
	 peel=true;
 }
	
 @Override
	public String toString() {
	 String a;
		if (peel)a="Почищен.";
		else{ a=" С кожурой.";}
		return "Вес "+weight+" г. Цвет "+color+"."+ ripeness+a;
	}
}
