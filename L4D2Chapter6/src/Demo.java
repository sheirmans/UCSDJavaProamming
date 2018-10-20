
public class Demo {
	// Fields
	// Instance Variable (one per instance)
	public int countInstance;
	
	// Class Variable (one per class)
	public static int countStatic;
	
	//Methods
	public void methodInstance() {
		System.out.println("countInstance: " + countInstance);
	}
	
	public static void methodStatic() {
		// Error: System.out.println("countInstance: " + countInstance);
		System.out.println("countStatic: " + countStatic);
	}
}
