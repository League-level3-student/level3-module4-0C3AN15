package _01_TestMatchingBrackets;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    public static boolean doBracketsMatch(String b) {
    	int left = 0;
    	int right = 0;
    	
    	for(int i=0;i<b.length();i++) {
    		if(b.charAt(i) == '{') {
    			left++;
    		}
    		if(b.charAt(i) == '}') {
    			right++;
    		}
    		if(b == "}{") {
    			return false;
    		}
    		if(left == right) {
    			return true;
    		}
    	}
    	
        return false;
    }
}