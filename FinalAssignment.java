/* Sheirman Szeto Final Assignment
Create a Java Project named FinalAssignmentFirstLast that demonstrates the key Java Skills you have learned during this course.
 The design should have a "top-level" abstract class named JavaSkill that has a member variable that is a String that contains the name of the skill. It will also have an abstract method named doDemo() that is called to demonstrate the skill.

You should create the following AT LEAST THREE of the 10 classes shown below, each inheriting from the JavaSkill abstract class. Any that you do beyond THREE will be used for bonus points, 1 bonus point for each extra skill demonstrated.

- PrimitiveTypeSkills
- ImportSkills
- ControlStatementSkills
- InstanceMethodSkills
- InstanceVariableSkills
- StaticMethodSkills
- StaticVariableSkills
- InheritanceSkills
- PolymorphismSkills
- InterfaceSkills

NOTE: Each of the above THREE skills (remember, you pick the 3 you want to demo) is worth 5 points each. Plus, you'll need a FinalAssignment.java too, which is also 5 points, for a total of 20 points in this final assignment.

Use an ArrayList<JavaSkills> to keep an array of each of these skills, then use a "for" statement to cycle through all the skills, calling the doDemo() on each skill. Send output to the console as you run each skill, showing results as your code runs.

You should enjoy this Final Assignment --- simply refer back to previous code demos to get ideas of how to demonstrate each skill. There is no single correct answer for this assignment, and you are free to do a "minimal" or a "maximum" implementation. The primary goal is to give you a chance to both review the key Java skills, and also to write code demonstrating those Java skills.

Create your Java files in a single directory named "FinalAssigmentFirstLast", where First and Last are your First and Last name. Submit your project as a zip file, i.e. FinalAssignmentFirstLast.zip".

NOTE: Please submit as a .zip file. Do not submit as .rar or .7z. Only .zip file please!

---*** psuedo code****--
--1. FinalAssignment - main program run
                     - has for loop to call each javaskill array and for statement calling doDemo(),
                     - JavaSkill abstract class 
                     - method doDemo()
                     - show each skill
--2.  PrimitiveSkill extends JavaSkill
--3.  ImportSkill extends JavaSkill
--4.  InstanceMethodSkills extends JavaSkill
 */
public class FinalAssignment {
	public static void main(String[] args) {

    //-- TODO create JavaSkill Array
//	private static final int NUMBER_OF_SKILLS = 5;
//	private arraySkill[] s = new arraySkill[NUMBER_OF_SKILLS];

    //--TODO create for loop
		

    //--TODO calling doDemo();
		
		
	//Demo 1 - PrimitiveTypeSkill
	System.out.println(">>1. Demo PrimitiveTypeSkills - using int, double");
	PrimitiveTypeSkills actSheirman = new PrimitiveTypeSkills("Sheirman","Szeto",2345667,4567);
	System.out.println("Account Name: " + actSheirman.getfirstName() + " " + actSheirman.getlastName() + "- Account Number: " + actSheirman.getAccountNumber() + "; Balance: " + actSheirman.getBalance());
    System.out.println();
    
	//Demo 2 - ImportSkill
	System.out.println(">>2. Demo ImportSkill - import Scanner utilities");
	
	
	System.out.println();
	
	//Demo 3 - InstanceMEthodSkills
	System.out.println(">>3. Demo Instance Method Skills");
	
	System.out.println();
	
	
	System.out.println("**** The End of the Demo***");
	}
}