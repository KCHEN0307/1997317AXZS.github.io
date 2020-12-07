
public class WorkbookChapter21Problem2 {

	public static void main(String[] args) {
		
		// Create an array with numbers from 0 to 100.
		int[] A = new int[101];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = i;
		}
		
		// initial the key 33.
		int key = 33;
		
		// test each number on array A whether it is equal to the key or not.
		for (int j = 0; j < A.length; j++) {
			
			if  (A[j] == key) {
				System.out.println("The number " + key + " is in position " + j + ".");
				break;
			}
			
			if (j == A.length - 1) {
				System.out.println("The number " + key + " is not in the array A.");
			}
		}
		
		

	}

}
