package arraysAndStrings;
import java.util.*;

/**
 * Given two strings, write a method to decide if one is a 
 * permutation of the other.
 * @author li223
 *
 */
public class OneptThree {
	public static void main (String [] args){
		String strOne, strTwo;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter sentence one");
		strOne = reader.nextLine();
		System.out.println("Please enter sentence two");
		strTwo = reader.nextLine();
		
		CheckForPermutation(strOne, strTwo);
		BookSolution(strOne, strTwo);
		reader.close();
	}
	
	public static void CheckForPermutation(String strOne, String strTwo){
		Hashtable<Character, Integer> hashOne = CreateHashtable(strOne);
		Hashtable<Character, Integer> hashTwo = CreateHashtable(strTwo);
		
		if(hashOne.equals(hashTwo)){
			System.out.println("The two strings are permutations of each other");
		}
		else {
			System.out.println("The two strings are NOT permutations of each other");
		}
	}
	
	public static Hashtable<Character, Integer> CreateHashtable(String hashString){
		Hashtable<Character, Integer> result = new Hashtable<Character, Integer>();
		int incCount;
		char currentLetter;
		
		for(int i = 0; i < hashString.length(); i++){
			currentLetter = hashString.charAt(i);
			if(result.containsKey(currentLetter)){
				incCount = result.get(hashString.charAt(i))+ 1;
				result.replace(currentLetter, incCount);
			}
			else {
				result.put(currentLetter, 1);
			}
		}
		
		return result;
	}
	
	public static void BookSolution(String one, String two){
		if(one.length() != two.length()){
			System.out.println("FALSE");
		}
		if(sort(one).equals(sort(two))){
			System.out.println("TRUE");
		}
	}
	
	public static String sort(String s){
		char[] charStr = s.toCharArray();
		java.util.Arrays.sort(charStr);
		return new String(charStr);
	}
}
