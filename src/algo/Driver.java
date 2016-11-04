package algo;


import java.util.Scanner;

public class Driver
{	
    Scanner inputs;
    BruteAutoComplete bruteAutocomplete;
    Reader reader;


    public Driver()
    {
    	inputs = new Scanner(System.in);
    	bruteAutocomplete = new BruteAutoComplete();
    	reader = new Reader();
    }
    public static void main(String args[]) {
        Driver app = new Driver();
        app.run();
    }	
	
	
	// main menu//
    private int mainMenu() {
    	System.out.println("-------------------------");
    	System.out.println("Main Menu");
        System.out.println("  1) Brute Auto Complete");
        System.out.println("  2) Quick Auto Complete");
        System.out.println("  3) Print out Array");
        System.out.println("-------------------------");
        System.out.println("  0) Exit");
        System.out.print("==>>");
        int option = inputs.nextInt();
        return option;
    }
 
    private void run() {
        int option = mainMenu();
        while (option != 0) {
            switch (option) {
            case 1:
            	brute();
                break;
 
            case 2:
                break;
                
            case 3:
            	reader.getArray();
            	break;
 
 
            default:
                System.out.println("Invalid option selected.");
                break;
            }
            run();
        }
        mainMenu();
    }
    
    public void getWeightOfPrefix()
    {
    	System.out.println("Enter a certain prefix: ");
    	String input = inputs.nextLine();
    	
		if (bruteAutocomplete.weightOf(input) > 0.0){
			System.out.println("The weight of " + input +" is " + bruteAutocomplete.weightOf(input));
		}
		else {
			System.out.println("The word is not in the list");
		}
    }
    
    public void getBestMatch()
    {
       	System.out.println("Enter a certain prefix: ");
        String input = inputs.nextLine();
    	System.out.println(bruteAutocomplete.bestMatch(input));
    	System.out.println("The best match of " + input +" is " + bruteAutocomplete.bestMatch(input));
    }
    
    public void getListOfBestMatches()
    {
		System.out.println("Enter a certain prefix: ");
		String prefix = inputs.nextLine();
		System.out.println("Enter the amount of matches you want to print out: ");
		int amount = inputs.nextInt();
		System.out.print("Here are" + amount + "items in the array that start with the prefix" + prefix + "=>" +  bruteAutocomplete.matches(prefix, amount));
    }
    
    
    private int bruteMenu() {
        System.out.println("  1) Find the weight of a prefix");
        System.out.println("  2) Find the best match of a prefix");
        System.out.println("  3) Get a list of Best Matches");
        System.out.println("-------------------------");
        System.out.println("  0) Exit");
        System.out.print("==>>");
        int option = inputs.nextInt();
        return option;
    }
    
    private void brute() {
        int option = bruteMenu();
        while (option != 0) {
            switch (option) {
            case 1:
            	getWeightOfPrefix();
                break;
 
            case 2:
            	getBestMatch();
                break;
 
            case 3:
            	getListOfBestMatches();
            	break;
    		
            default:
                System.out.println("Invalid option selected.");
                break;
            }
            run();
        }
        bruteMenu();
    }
}


