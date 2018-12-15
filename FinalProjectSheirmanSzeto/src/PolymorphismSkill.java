
public class PolymorphismSkill extends JavaSkill {

	public PolymorphismSkill() {
		super("PolymorphismSkill");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doDemo() {
		System.out.println("Demo Polymorphism usnig Drawing Objects");
		
		DrawingObject[] array = { new Circle(), new Square() };
		for (DrawingObject o : array) {
			o.move();
		}
	}

}
