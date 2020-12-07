import java.util.Arrays;

public class WorkbookChapter1Problem8 {

	public static void main(String[] args) {
		
		// n value starts from 1;
		int n = 1;
		
		// make an array to contain the results of the calculations.
		int[] Number = new int[10];
		
		System.out.println("When the value n goes from 1 to 10, the result of the function f(n) = 3n+1 should be: ");
		
		// using "for" loop to do the calculation 10 times, which n goes from 1 to 10.
		for (int i = 0; i < 10; i++) {
			
			// function f(n) = 3n+1;
			Number[i] = 3 * n + 1;
			
			// n increase from 1 to 11, but the number of 11 does not do the calculation.
			n++;
							
		}
		
		// Print out the series of the results.
		System.out.println (Arrays.toString(Number));

	}

}
