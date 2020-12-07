import java.util.LinkedList;

public class WorkbookChapter6Problem9 {

	public static void main(String[] args) {
		
		// Create the linked list.
		LinkedList<Integer> num = new LinkedList<Integer>();
		num.add(3);
		num.add(2);
		num.add(9);
		num.add(0);
		num.add(12);
		
		System.out.println("The linked list has " + CountSize(num) + " elements.");

	}
	
	static int CountSize(LinkedList<Integer> list){
		
		if (list.isEmpty()){
			return 0;
		} else {
			list.remove(0);
			return 1 + CountSize(list);
		}		
		
	}

}
