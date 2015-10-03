package arraysAndStrings;
import java.util.*;
public class Pangrams {
	public static void main(String [] args){
		Set<Character> alphabet = new HashSet<>();
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a string of text:");
		String sentence = reader.nextLine();
		
		for(char ch = 'a'; ch <= 'z'; ch++){
			alphabet.add(ch);
		}
		
		sentence.toLowerCase();
		for(int i = 0; i < sentence.length(); i++){
			if(alphabet.contains(sentence.charAt(i))){
				alphabet.remove(sentence.charAt(i));
			}
		}
		
		PrintResult(alphabet);
		reader.close();
	}
	
	public static void PrintResult(Set<Character> alphabet){
		if(alphabet.isEmpty()){
			System.out.println("Sentence is a pangram!");
		}
		else {
			System.out.println("The sentence is missing: ");
			for(char c : alphabet){
				System.out.print(c);
			}
		}
	}
	
}
