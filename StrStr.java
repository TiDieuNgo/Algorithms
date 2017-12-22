package LeetCode;

public class StrStr {
	public static void main (String[] agrs) {
		//System.out.println(strStr ("",""));
	}
	
	 public static int strStr(String haystack, String needle) {
	        int result = -1;
	        int n1 = haystack.length();
	        int n2 = needle.length();
	        char[] str1 = haystack.toCharArray();
	        char[] str2 = needle.toCharArray();
	        
	        
	        if (str1.length == 0 && str2.length == 0)
	            return 0;
	        if (n2 == 0)
	            return result;
	        
	        for (int i = 0; i < n1; i++) {
	            if (str2[0] == str1[i]) {
	                result = i;
	                
	                if (n2 > n1 - i)
	                    return -1;
	                else {
	                    for (char c : str2) {
	                        if (c != str1[i]) {
	                            result = -1;
	                            break;
	                        }
	                        else
	                            i++;
	                    } 
	                    if (result != -1)
	                        return result;
	                } 
	            }
	        }
	        return result;
	    }
}
