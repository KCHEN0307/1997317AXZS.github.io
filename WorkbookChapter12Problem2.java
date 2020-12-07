import java.util.HashMap;

public class WorkbookChapter12Problem2 {

	public static void main(String[] args) {
		
		HashMap<String, Double> map = new HashMap<>();
		
		map.put("potato", 0.65);
		map.put("celery", 0.30);
		map.put("carrot", 1.99);
		
		System.out.println("Key \t\t Value");
		
		for (String key : map.keySet()){
			String value = map.get(key).toString();
			System.out.println(key + "\t\t" + value);
		}
		

	}

}
