// 35)Create a HashMap type and display the elements using the keyset ()


import java.util.HashMap;

public class programmmm35 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Oranges", 20);
        map.put("Grapes", 30);
        for (String key: map.keySet()) {
    		System.out.println(key + "=" + map.get(key));
		}  
}

}