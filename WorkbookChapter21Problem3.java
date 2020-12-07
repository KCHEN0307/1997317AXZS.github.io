
public class WorkbookChapter21Problem3 {

	public static void main(String[] args) {
		
		// t is number we need to find.
		int t = 7;
		
		// Copy down the array A.
		int[] A = {1, 2, 5, 7, 9};
		
		String P = "";
		
		// Using for loop to compare each element in the array A with the value t.
		for (int i = 0; i < A.length; i++) {
			
			if (A[i] == t) {
				P = ("The number "+ t + " is in A, which is in the position " + i +".");
				break;
			} else {
				P = ("The number " + t + " is not in A.");
			}
		}
		
		System.out.println(P);
		
	}

}
