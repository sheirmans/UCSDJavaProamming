
public class Truck implements Diagnostics {

	@Override
	public void reset() {
		System.out.println(this.toString() + ": reset()");  //it will pick up the name of this class
		
	}

	@Override
	public void start() {
		System.out.println(this.toString() + ": start()");
		
	}

	@Override
	public void stop() {
		System.out.println(this.toString() + ": stop()");
		
	}

	@Override
	public void getResults() {
		System.out.println(this.toString() + ": getResults()");
		
	}

}
