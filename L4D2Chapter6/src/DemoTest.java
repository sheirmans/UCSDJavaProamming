
public class DemoTest {

	public static void main(String[] args) {
		// Demo Class Methos and Class Variables
		System.out.println("Demo.countStatic: " + Demo.countStatic);
		Demo.countStatic++;
		System.out.println("Demo.countStatic: " + Demo.countStatic);

		// Call a class method
		Demo.methodStatic();
		
		System.out.println("Math.sqrt(4): " + Math.sqrt(4));
		
		// Instance Methods and Instance Variables
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		demo1.countInstance = 12;
		demo2.countInstance = 34;
		demo1.methodInstance();
		demo2.methodInstance();
		demo1.methodStatic();  //need to access in a static way
		demo2.methodStatic();
	}

}
