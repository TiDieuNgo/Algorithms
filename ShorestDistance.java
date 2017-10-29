package LeetCode;

public class ShorestDistance {

	public static void main(String[] args) {
		
		String[] words = {"a","b"};
		String word1 = "a";
		String word2 = "b";
		int word1_index = words.length;
        int word2_index = words.length;
        int result = Integer.MAX_VALUE;
        
        System.out.println("a" + result);
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)){
                word1_index = i;
                
                if (result > Math.abs(word1_index - word2_index)){
                    System.out.println("a" + result);
                    result = Math.abs(word1_index - word2_index);
                }
            }
            
            if (words[i] == word2){
                word2_index = i;
                
                if (result > Math.abs(word1_index - word2_index)){
                    System.out.println("a" + result);
                    result = Math.abs(word1_index - word2_index);
                }
                     
            }
        }
        
        System.out.println(result);
	}
}
