
public class StaticSkill extends JavaSkill{

	private static int staticVarPrivate;
	protected static int staticVarProtected;
	public static int staticVarPublic;
	
	private static void staticMethodPrivate() { }
	protected static void staticMethodProtected() { }
	public static void staticMethodPublic() { }
		
	public StaticSkill() {
		super("StaticSkills");
	}

	@Override
	public void doDemo() {
		System.out.println("Static Variables and Static Methods");
		System.out.println("StaticDemo.staticVarProtected: " + StaticDemo.staticVarProtected);
		System.out.println("StaticDemo.staticVarPublic: " + StaticDemo.staticVarPublic);
		StaticDemo.staticMethodProtected();
		StaticDemo.staticMethodPublic();
		System.out.println();
	}

}
