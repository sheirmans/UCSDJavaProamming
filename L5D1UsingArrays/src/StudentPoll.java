
public class StudentPoll {

	public static void main(String[] args) {
		//Response was rating from 1-5
		int[] responses = {1,2,5,3,1,5,3,4,5,1,3,14};
		int[] frequency = new int[6];
		
		// Count the frequency of each response
		for (int answer = 0; answer < responses.length; answer++) {
			try {			
				++ frequency[responses[answer]];
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught the exception!");
				System.out.println(e);
				//System.out.println(e.toString());
			}
		}
			
		//Display the header
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		for (int rating = 1; rating < frequency.length; rating++) {
			System.out.printf("%6d%10d%n", rating,frequency[rating]);
		}

	}

}
