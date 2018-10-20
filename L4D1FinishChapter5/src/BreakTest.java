
public class BreakTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", i);
			if (i == 5) {
				break;
			}
		}
		System.out.println();
		System.out.println("All Done");
	}

}
