
public abstract class JavaSkill {
	
	private String name;          //make abstract private normally (can change it to getter/setter to get the name later
	
	public JavaSkill(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public abstract void doDemo();
	
}
