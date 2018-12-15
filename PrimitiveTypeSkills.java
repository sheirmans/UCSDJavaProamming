public class PrimitiveTypeSkills extends JavaSkill {
	private String firstName;  
	private String lastName;
	private int accountNumber;   //** Primitive Type **/
	private double balance;      //** Primitive Type **//

	public void doDemo() {
		System.out.println("Demo - Primitive Type");
	}
	
	
	//declare methods to access the private name
	public void setfirstName(String firstName) {     
		this.firstName = firstName;
	}
	
	public void setlastName(String lastName) {     
		this.lastName = lastName;
	}
	
	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}
	
	public void setAccount(int accountNumber) {
		this.accountNumber = accountNumber;
	}
    public int getAccountNumber() {
    	return accountNumber;
    }
	
    public void deposit(double depositAmount) {
    	if (depositAmount > 0.00) {
    		balance = balance + depositAmount;
    	}
    }
    
    public double getBalance() {
    	return balance;
    }
    


	public PrimitiveTypeSkills(String firstName, String lastName, int accountNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	//Override the parent's toString() from superclass
    public String toString() {                   
//    	return name + ", " + accountNumber + ", " + balance;
    	return super.toString() + ", " + firstName + ", " + lastName + ", " + accountNumber + ", " + balance;
        //override to include the superclass
    }
}		
		



