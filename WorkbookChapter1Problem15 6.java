import java.util.Arrays;

public class WorkbookChapter1Problem15 {

	public static void main(String[] args) {
		
		// Print the array of numbers.
		System.out.println("If n is a positive number: ");
		System.out.println(Arrays.toString(sortArray(10)));
		System.out.println("If n is a 0: ");
		System.out.println(Arrays.toString(sortArray(0)));
		System.out.println("If n is a negative number: ");
		System.out.println(Arrays.toString(sortArray(-10)));

	}
	
	static String[] sortArray(int n) {
		
		// find the result of each functions.
		double a = n;
		double b = n * n * n;
		double c = 1;
		double d = 1.5 * n;
		double e = n * n;
		double f = 2 * n;
		double g = (double) (Math.log(n) / Math.log(2));
		
		// a temporary number that can be used to switch elements in the array.
		double h = 0;
		
		// an array of the results of the function.
		double[] arr = {a, b, c, d, e, f, g};
		
		// the array which the final answer we need to find.
		String[] SArray = new String[7];
		
		// sort the results of the function in descending order.
		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 6; j++) {
				if (arr[i] < arr[j]) {
					h = arr[i];
					arr[i] = arr[j];
					arr[j] = h;
				}
			}
		}
		
		// change the array of numbers to their corresponding function.
		for (int k = 0; k < 7; k++) {
			if (arr[k] == a) {
				SArray[k] = "n";
			} else if (arr[k] == b) {
				SArray[k] = "n^3";
			} else if (arr[k] == c) {
				SArray[k] = "1";
			} else if (arr[k] == d) {
				SArray[k] = "(3/2) * n";
			} else if (arr[k] == e) {
				SArray[k] = "n^2";
			} else if (arr[k] == f) {
				SArray[k] = "2n";
			} else {
				SArray[k] = "log2(n)";
			}
		}
		
		return SArray;
	}

}
