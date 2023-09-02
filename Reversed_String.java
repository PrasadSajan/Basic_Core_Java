package Strings;

public class Reversed_String {
	  public static void main(String[] args) {
	    String str = "Quiz $ Day !";
	    String reversed = reverseString(str);
	    System.out.println(reversed);
	  }

	  public static String reverseString(String s) {
	    if (s.isEmpty()) {
	      return s;
	    } else {
	      return reverseString(s.substring(1)) + s.charAt(0);
	    }
	  }
	}