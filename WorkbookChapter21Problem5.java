import java.util.Arrays;

public class WorkbookChapter21Problem5 {

	public static void main(String[] args) {
		
		int[] A = {1, 3, 5, 7, 9, 11};
		
		int n = 7;
		int t = 0;
		
		int l = BinarySearch(A, n, t);
		
		System.out.println("The number 7 is on the position "+ l);

	}
	
	static int BinarySearch(int[] A, int n, int t){
		
		//put the current array in half.
		int l = A.length / 2;
		int[] B = Arrays.copyOfRange(A, 0, l-1);
		int[] C = Arrays.copyOfRange(A, l+1, A.length);
		
		
		if (A[l] == n){
			return t + l;
		} else if (A[l] > n) {
			BinarySearch(B, n, t);
		} else {
			BinarySearch(C, n, t+l);
		}
		return t + l;
	}

}
