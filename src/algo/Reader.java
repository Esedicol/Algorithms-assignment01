package algo;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader 
{
	ArrayList<Term> listOfTerms = new ArrayList<>(); //  //array list of terms form Term class	
	Scanner inUsers;

	public Reader() 
	{

	}


	public ArrayList<Term> addTerms() throws FileNotFoundException//Exception // // Method of split of data in string and double
	{
		File usersFile = new File("content.txt");	//it is adding  file with list of data
	
		inUsers = new Scanner(usersFile);
 
		String delims = "	";//each field in the file is separated(delimited) by a space.
		while (inUsers.hasNextLine()) 
		{
			// get user and rating from data source
			String userDetails = inUsers.nextLine();
			// parse user details string
			String[] userTokens = userDetails.split(delims);

			// output user data to console.

			Term word = new Term();
			word.weight = Double.parseDouble(userTokens[0]);   
			word.value = (userTokens[1]);
			listOfTerms.add(word);
		}
		inUsers.close();
		return listOfTerms;
	}

	// get the list of terms in the array//
	public ArrayList<Term> getArray()
	{
		return listOfTerms;
	}

}

