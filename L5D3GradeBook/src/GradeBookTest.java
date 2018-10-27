
public class GradeBookTest {

	public static void main(String[] args) {
		int[] grades = {87,99,90,78,100,95};
		GradeBook myGradeBook = new GradeBook("Intro to Java", grades);
		System.out.println("Welcome to grade book for " + myGradeBook.getCourseName());
		myGradeBook.processGrades();
		System.out.println("All Done");

	}

}
