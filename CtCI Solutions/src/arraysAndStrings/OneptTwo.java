package arraysAndStrings;

import java.util.*;
/**
 * Implement a function which reverses a string
 * @author li223
 *
 */
public class OneptTwo {
	public static void main (String [] args){
		String origSentence, reverseSentence;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a string to reverse");
		origSentence = reader.nextLine();
		ReverseString(origSentence);
		reader.close();
	}
	
	public static void ReverseString(String origSentence){
		String reversed = "";
		for(int i = origSentence.length() - 1; i >= 0; i--){
			reversed = reversed + origSentence.charAt(i);
		}
		System.out.println(reversed);
	}

}
