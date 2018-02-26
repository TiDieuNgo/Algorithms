package maximumOccurringCharacterInString;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		findMaxOccChar("ad df dfa we re");
	}

	private static void findMaxOccChar(String string) {
		int max = 0;
		Character result = null;
		HashMap<Character, Integer> myHM = new HashMap<>();
		createOccHashMap(myHM,string);
		findMaxOccInHashMap(myHM, max,result);
	}

	private static void createOccHashMap(HashMap<Character, Integer> myHM, String string){
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				if (myHM.containsKey(string.charAt(i)))
					myHM.put(string.charAt(i), myHM.get(string.charAt(i)) + 1);
				else
					myHM.put(string.charAt(i), 1);
			}
		}
	}

	private static void findMaxOccInHashMap(HashMap<Character, Integer> myHM, int max, Character result){
		for(Map.Entry<Character, Integer> entry : myHM.entrySet()){
			if( entry.getValue() > max){
				max = entry.getValue();
				result = entry.getKey();
			}
		}
		System.err.println(result);
	}
}
