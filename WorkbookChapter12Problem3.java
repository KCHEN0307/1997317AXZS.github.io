import java.util.HashMap;

public class WorkbookChapter12Problem3 {

	public static void main(String[] args) {
		
HashMap<String, Double> map = new HashMap<>();
		
		map.put("apple", 1.27);
		map.put("pear", 1.50);
		map.put("kiwi", 1.99);
		map.put("kiwi", 2.50);
		
		System.out.println("Key \t\t Value");
		
		for (String key : map.keySet()){
			String value = map.get(key).toString();
			System.out.println(key + "\t\t" + value);
		}
		

	}

}
