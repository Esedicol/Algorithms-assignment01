package algo;

import java.util.Scanner;

public class BestMatch {
	
	public static void main (String[] args)
	{
		BruteAutoComplete bruteAutocomplete = new BruteAutoComplete();
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Enter a certain prefix: ");
        String input = inputs.nextLine();
    	System.out.println(bruteAutocomplete.bestMatch(input));
    	System.out.println("The best match of " + input +" is " + bruteAutocomplete.bestMatch(input));
	}

}
