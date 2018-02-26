package itinerary;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("a", "b");
		map.put("c", "d");
		map.put("d", "e");
		map.put("b", "c");

		findItinerary(map);
	}

	private static void findItinerary(HashMap<String, String> map){
		String start = "";
		for(Map.Entry<String, String> entry : map.entrySet()){
			if (!map.values().contains(entry.getKey())) {
				start = entry.getKey();
				break;
			}
		}
		for(Map.Entry<String, String> entry : map.entrySet()){
			if(entry.getKey().equals(start)){
				System.out.println(entry.getKey() + "->" + entry.getValue());
				start = entry.getValue();
			}
		}
	}
}
