
public class InitArrayV1 {

	public static void main(String[] args) {
		// create an instance of an int array
		int[] array;  //Referene to int array
		array = new int[3]; //Allocate an object
		/*System.out.println(array);
		System.out.println(array.toString());
		*/
		//output the value of each item
		//NOTE: All are initialized to 0 by default
		/*for (int i = 0; i < array.length;i++) {
			System.out.printf("%d - %dn",  i, array[i]);
		}*/
		displayArray(array);
		//Set all entries in the array
		for (int i= 0; i <array.length; i++) {
			array[i] = i * i;
		}
		displayArray(array);
		
		//create a second array
		int[] grades = { 85, 90, 100, 95 };
		displayArray(grades);
		
		//change reference of array to reference grades
		array  = grades;
		displayArray(array);
		
		//sum all the values in the array
		int total = 0;
		for (int j = 0; j < grades.length; j++) {
			total += grades[j];
		}
		System.out.println("Total: "+ total);
		
		//Array of bar chart values
		int[] barValues = { 0, 2, 1, 4, 5};
		// Display index, value an count of "*"
		for (int i =0; i < barValues.length; i++) {
			System.out.printf("%d = %d ", i, barValues[i]);
			for (int j = 1; j <= barValues[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void displayArray(int[] array) {
		System.out.println(array);
		//Option 1 to display array values
		for (int i = 0; i < array.length;i++) {
			System.out.printf("%d - %d%n",  i, array[i]);
		}		
		
		//Option 2 to display array values
		for (int num : array) {
			System.out.printf("%d%n", num);
		}
	}

}
