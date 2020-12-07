import java.util.Arrays;

public class WorkbookChapter14Problem4 {

	public static void main(String[] args) {
		
		// Copy down the array from the question.
		int[] arr = {8, 4, 9, 7, 2, 5, 10, 1, 3, 6};
		
		System.out.println(Arrays.toString(arr));
		
		 //a temporary number that can be used to switch elements in the array.
		int temp = 0;
		
		int n = arr.length;
		
		// we need to sort the array in n steps.
		for (int i = 0; i < n; i++) {
			
			// Compare each two connected elements, and switch them if the front one is bigger than the back one.
			for (int j = 1; j < (n - i); j++) {
				
				if (arr[j-1] > arr[j]) {
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					// Print the array of each change.
					System.out.println(Arrays.toString(arr));
					
				}
			}
		}

	}

}
