
public class PrimitiveTypeSkill extends JavaSkill {

	public PrimitiveTypeSkill(String name) {
		super(name);
	}

	@Override
	public void doDemo() {

		String msg = "Java has 8 primitive types";
		System.out.println(msg);
		
		//  The 8 primitive types
		byte b = 0x12;
		short s  = 0x1234;
		int i = 0x1234_5678;
		long l = 0x1234_5678;
		char c = 'a';
		float f = 12.34f;
		double d = 12.34;
		boolean flag = true;
		
		System.out.printf("byte: 0x%x%n", b);
		System.out.printf("short: 0x%x%n", s);
		System.out.printf("int: 0x%x%n", i);
		System.out.printf("long: 0x%x%n", l);
		
		System.out.println("char: " + c);
		System.out.println("float: " + f);
		
		System.out.println("boolean:" + flag);
		System.out.println();
	}

}
