package academy.learnprogramming.queueschallenge;

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
    	LinkedList<Character> queue = new LinkedList<Character>();
    	for(int i = 0 ; i < string.length() ; i++) {
    		if(Character.isAlphabetic(string.charAt(i))) {
    			stack.push(string.charAt(i));
    			queue.addLast(string.charAt(i));
    		}
    	}
    	String reverseString = new String();
    	while(!stack.isEmpty()) {
    		reverseString = reverseString + stack.pop().toString().toLowerCase();
    	}
    	
    	String resultString = new String();
    	while(!queue.isEmpty()) {
    		resultString = resultString + queue.removeFirst().toString().toLowerCase();
    	}

        return resultString.equals(reverseString);
    }
}
