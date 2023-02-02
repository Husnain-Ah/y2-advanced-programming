package Lab2;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text; int sentences = 0;
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter a block of text: ");
		
		String a = Input.next();
		text = a;
		
		Input.close();
		
		String replaced = text.replaceAll("\\s+", ""); // replace whitespace with blank
		int chars = replaced.length(); // length of only letters with no spaces
		
		String[] words = text.split(" "); // splits the word by whitespace
		int word = words.length; // counts words by segmenting them by the spaces

		String[] array = text.split("\\. "); // splits sentences by full stop as end of sentence
		for(String str : array) {// each sentence is an index in the array
			sentences += 1; // for each index it counts one
		}
		
		
		double ari = 4.71 * (chars / word) + 0.5 * (word / sentences) -21.43; // this is the calculation
		
		System.out.println("Your Automated readability index is " + ari);

	}
		
}
