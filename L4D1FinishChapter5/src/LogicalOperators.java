
public class LogicalOperators {

	public static void main(String[] args) {
		boolean flag1 = false;
		boolean flag2 = true;
		boolean flag3 = true;
		boolean flag4 = false;
		
		// Logical AND 
		// false false => false
		// false true  => false
		// true false  => false
		// true true   => true
		if ((flag1 == true) && (flag2 == true)) {
			System.out.println("AND checkpoint 1");
		}
		if ((flag2 == true) && (flag3 == true)) {
			System.out.println("AND checkpoint 2");
		}
		
		//Logical OR
		// false false => false
		// false true  => true
		// true false  => true
		// true true   => true
        if ((flag1 == true) || (flag2 == true)) {
        	System.out.println("OR checkpoint 1");
        }
        if ((flag1 == true) || (flag4 == false)) {
        	System.out.println("OR checkpoint 2");
        }
        
        //some more practice (using Boolean Logical Ops)
        if (flag1 & flag2) {
        	System.out.println("flag1 and flag2 are true");
        }
        if (flag1 | flag2) {
        	System.out.println("flag1 or flag2 is true");
        }
        if (flag1 ^ flag2) {
        	System.out.println("flag1 and flag2 are different");
        }
        System.out.println("flag1 " + flag1);
        System.out.println("!flag1 " + !flag1);
    }
}

