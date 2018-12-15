
public class InstanceSkill extends JavaSkill {

	private int instanceVarPrivate;
	protected int instanceVarProtected;
	public int instanceVarPublic;
	
	private void instanceMethodPrivate() { }
	protected void instanceMethodProtected() { }
	public void instanceMethodPublic() {  }
	
	public InstanceSkill() {
		super("InstnaceSkill");
		
	}

	@Override
	public void doDemo() {
		System.out.println("Instance Variables and Instance Methods");
		InstanceDemo demo = new InstanceDemo();
		System.out.println("demo.instanceMethodProtected: " + demo.instanceVarProtected);
		System.out.println("demo.instanceMethodPublic: " +demo.instanceVarPublic);
		demo.instanceMethodProtected();
		demo.instanceMethodPublic();
	}

}
