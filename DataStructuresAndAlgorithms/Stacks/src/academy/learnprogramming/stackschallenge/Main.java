package academy.learnprogramming.stackschallenge;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
    	LinkedList<Character> stack = new LinkedList<Character>();
    	String stringWithNoPanchuations = new String();
    	for(int i = 0 ; i < string.length() ; i++) {
    		if(Character.isAlphabetic(string.charAt(i))) {
    			stringWithNoPanchuations = stringWithNoPanchuations + string.charAt(i);
    			stack.push(string.charAt(i));
    		}
    	}
    	String resultString = new String();
    	while(!stack.isEmpty()) {
    		resultString = resultString + stack.pop().toString().toLowerCase();
    	}
    	return stringWithNoPanchuations.equalsIgnoreCase(resultString);
    	//return isPalindrome(resultString);
    }
    
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
