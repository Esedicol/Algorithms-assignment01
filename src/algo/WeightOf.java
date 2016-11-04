package algo;

import java.util.Scanner;

public class WeightOf {
	public static void main (String[] args)
	{
		BruteAutoComplete bruteAutocomplete = new BruteAutoComplete();
		Scanner inputs = new Scanner(System.in);
	
	System.out.println("Enter a certain prefix: ");
	String input = inputs.nextLine();
	
	if (bruteAutocomplete.weightOf(input) > 0.0){
		System.out.println("The weight of " + input +" is " + bruteAutocomplete.weightOf(input));
	}
	else {
		System.out.println("The word is not in the list");
	}
	}

}
