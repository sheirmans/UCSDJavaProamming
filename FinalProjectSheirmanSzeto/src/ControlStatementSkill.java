
public class ControlStatementSkill extends JavaSkill {

	public ControlStatementSkill() {
		super("ControlStatementSkills");
	}

	@Override
	public void doDemo() {
		
		String msg = "Control Flow: if, else, switch";
		System.out.println(msg);
		
		boolean flag = true;
		if (flag) {
			System.out.println("flag is true");
			
		}
		else {
			System.out.println("flag is false");
		}
	
		
		int i = 3;
		switch (i) {
			case 0:
			case 1:
			case 2:
				System.out.println("i is 0, 1, or 2");
				break;
			case 3:
				System.out.println("i is 3");
				break;
			default: 
				System.out.println("default condition");
		}
		
		msg = "Looping: for, while, do";
		System.out.println(msg);
		
		System.out.println("for:");
		for (int j = 0; j <3; j++) {
			System.out.println(j);
		}
		

		System.out.println("while:");
		i = 3;
		while (i != 0) {
			System.out.println(i--);
		}
		
		
		System.out.println("do:");
		i = 3;
	    do {
			System.out.println(i++);
		} while (i < 6);
	}

}
