package arraysAndStrings;
import java.util.*;

/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * @author li223
 *
 */
public class OneptOne {
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sentence = reader.nextLine();
		if(isUniqueChars(sentence)){
			System.out.println("The sentence cotains all unique characters.");
		}
		else {
			System.out.println("This sentence contains duplicate characters.");
		}
		
	}
	
	public static boolean isUniqueChars(String sentence){
		boolean isUnique = true;
		Set<Character> uniqueChar = new HashSet<Character>();
		for(int i = 0; i < sentence.length(); i++){
			if(uniqueChar.contains(sentence.charAt(i))){
				isUnique = false;
				i = sentence.length();
			}
			else {
				uniqueChar.add(sentence.charAt(i));
			}
		}
		return isUnique;
	}

}
