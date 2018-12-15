
public class InterfaceSkill extends JavaSkill {

	public InterfaceSkill() {
		super("InterfaceSkill");   //no passing value constructor use default constructor
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doDemo() {
		System.out.println("Demo different classes implementing same interface");
		
		Diagnostics[] array = { new Truck(), new WashingMachine() } ;
		for (Diagnostics d: array) {
			d.reset();
			d.start();
			d.stop();
			d.getResults();
		}
		
	}

}
