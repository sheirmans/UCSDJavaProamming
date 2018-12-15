import java.lang.Math;


public class ImportSkill extends JavaSkill {
	public ImportSkill(String name) {
		super(name);
	}

	@Override
	public void doDemo() {
		System.out.println("Using java.lang.Math");
		
		double result = Math.sqrt(16.0);
		System.out.println("Math.sqrt(16.0): " + result);
		
		result = java.lang.Math.sqrt(16.0); //another method to do this without the import by typing this
		System.out.println("Math.sqrt(16.0): " + result);		
		
		System.out.println();
	}
	
	
}
