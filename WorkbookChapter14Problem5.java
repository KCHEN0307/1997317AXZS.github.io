import java.util.Arrays;

public class WorkbookChapter14Problem5 {

	public static void main(String[] args) {
		
		// The array we need to sort in this question.
		char[] A = {'B', 'R', 'O', 'O', 'K', 'L', 'Y', 'N', 'C', 'O', 'L', 'L', 'E', 'G', 'E'};
		
		// print out the array
		System.out.println(Arrays.toString(A));
		
		// A temporary character that can be use to switch elements in array A.
		char temp;
		
		int n = A.length;
		
		// we need to sort the array in n times.
		for (int i = 0; i < n; i++) {
			
			// for each time, compare the two connected elements, if the front one greater than the back on, switch them.
			for (int j = 1; j < (n - i); j++) {
				
				if (A[j-1] > A[j]) {
					
					temp = A[j-1];
					A[j-1] = A[j];
					A[j] = temp;
					
					// print out the array in each change.
					System.out.println(Arrays.toString(A));
				}
			}
		}

	}
	
	

}
