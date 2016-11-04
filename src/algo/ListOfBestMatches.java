package algo;

import java.util.Scanner;

public class ListOfBestMatches {
	
	public static void main (String[] args)
	{
		BruteAutoComplete bruteAutocomplete = new BruteAutoComplete();
		Scanner inputs = new Scanner(System.in);

	System.out.println("Enter a certain prefix: ");
	String prefix = inputs.nextLine();
	System.out.println("Enter the amount of matches you want to print out: ");
	int amount = inputs.nextInt();
	System.out.print("Here are" + amount + "items in the array that start with the prefix" + prefix + "=>" +  bruteAutocomplete.matches(prefix, amount));
	}
}
