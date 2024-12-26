package first_java_project2024;

public class ProjectEuler {
// main method is the entry point of the program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Discrete Structures HW Problem 1!"); 
		// primitive data types = not changeable  ... creating int variable below
		int sum = 0;
		// getting range of numbers and then incrementing
		for (int i =0; i<1000; i++){
			// The following: || operator is Python "or"
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("The answer to Problem 1 is: " + sum);
		}

}
// Takeaway: For conditional statements and loops Python uses indentation while Java uses {} 
// sources: 
// https://www.dotnetperls.com/for-java 
// https://docs.oracle.com/en/java/javase/18/docs/api/
// https://www.geeksforgeeks.org/operator-in-java/
