import java.util.ArrayList;

public class FinalAssignmentJava1 {

	public static void main(String[] args) {
		
		welcomeMessage();
		
		PrimitiveTypeSkill pts = new PrimitiveTypeSkill("Primitive Type Skills");  //constructor
//		System.out.println("pts.toString(): " + pts.toString());
		System.out.println(pts.toString());
		pts.doDemo();
		

		ImportSkill importSkill = new ImportSkill("Import Skills");
		System.out.println("importSkill.toString():" + importSkill);
		importSkill.doDemo();
		
		
		
		// Now put the above above into an array list
		System.out.println("==> Now using ArrayList for demo");
		
		//Create an array list of JavaSkill
		ArrayList<JavaSkill> javaSkills = new ArrayList<JavaSkill>();
		javaSkills.add(pts);
		javaSkills.add(importSkill);
		javaSkills.add(new ControlStatementSkill());  //another option to add the array in one line
		
		InstanceSkill instanceSkill = new InstanceSkill();
        System.out.println("instanceSkills: " + instanceSkill.instanceVarProtected);
        System.out.println("instanceSkills: " + instanceSkill.instanceVarPublic);
        javaSkills.add(instanceSkill);
        
        StaticSkill.staticMethodPublic();
        javaSkills.add(new StaticSkill());
        
        javaSkills.add(new InheritanceSkill());
        javaSkills.add(new PolymorphismSkill());
        javaSkills.add(new InterfaceSkill());
		
		//Demo all the skills
		for (JavaSkill skill : javaSkills) {
			System.out.println("==>" + skill.toString());
			skill.doDemo();
			System.out.println();
		}
		
	}

	private static void welcomeMessage() {
		System.out.println("Final Assignment - Java 1 Course");
		System.out.println("Code by Sheirman Szeto");
		
	}

}
