
public class InheritanceSkill extends JavaSkill{

	public InheritanceSkill() {
		super("InheritanceSkill");
		
	}

	@Override
	public void doDemo() {
		System.out.println("Create instance of SolarCar/Car/Vehicle");
		
		SolarCar solarCar = new SolarCar();
		System.out.println(solarCar);
	}

}
