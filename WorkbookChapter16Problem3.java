import java.util.Arrays;

public class WorkbookChapter16Problem3 {

	public static void main(String[] args) {
		
		// create the array.
		int[] arr = {8, 4, 9, 7, 2, 5};
		
		//the number which can be used in switching numbers.
		int temp = 0;
		
		//Check each number in the array.
		for (int i = 1; i < arr.length; i++){
			
			for(int j = 0; j < i; j++){
				// if the current number is smaller than any number before it, we can put it at that position, and every number after that position should move back.
				if (arr[j] > arr[i]){
					temp = arr[i];
					for(int t = i; t > j; t--){
						arr[t] = arr[t-1];
					}
					arr[j] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}

	}

}
