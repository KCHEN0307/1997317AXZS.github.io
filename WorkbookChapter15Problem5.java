import java.util.Arrays;

public class WorkbookChapter15Problem5 {

	public static void main(String[] args) {
		
		// Copy down the array of letters.
		char[] arr = {'B', 'R', 'O', 'O', 'K', 'L', 'Y', 'N', 'C', 'O', 'L', 'L', 'E', 'G', 'E'};
		
		// pick the number of the i^th element of the array.
		for (int i = 0; i < arr.length - 1; i++) {
			
			// x is the index of the smallest element from the i^th element to the end of the array.
			int x = i;
			
			// do the comparison, and find the smallest element from the i^th element to the end of the array.
			for(int j = i+1; j < arr.length; j++ ) {
				
				if (arr[j] < arr[x]) {
					x = j;
				}
			}
			
			// switch the smallest element and the i^th element. 
			char s = arr[x];
			arr[x] = arr[i];
			arr[i] = s;
			
			System.out.println(Arrays.toString(arr));
		}

	}

}
