
public class Car extends Vehicle {
	
	public Car() {
		System.out.println("Car constructor");
	}
	
	public String toString() {
		return super.toString() + "/Car.toString()";
	}
}
