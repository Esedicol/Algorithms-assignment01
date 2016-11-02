
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
	
	public static void main(String[] args) throws Exception {
		List<Term> terms = new ArrayList<Term>();
		File fileName = new File("content.txt");
	    Scanner inUsers = new Scanner(fileName);
		    
		  String delims = "\t";//each field in the file is separated(delimeted) by a space.
		  while (inUsers.hasNextLine()) {
		    // get user and rating from data source
		    String userDetails = inUsers.nextLine().trim();
		    // parse user details string
		    String[] userTokens = userDetails.split(delims);

		    // output user data to console.
		    if (userTokens.length == 2) {
		      System.out.println("Weight: " + userTokens[0] + "Term: " + userTokens[1]);
		      System.out.println("Term: " + userTokens[1]);
              Term newTerm = new Term(userTokens[1], Long.parseLong(userTokens[0]));
              terms.add(newTerm);
             
		    }else
		    {
		      inUsers.close();
		      throw new Exception("Invalid member length: "+userTokens.length);
		    }
		  }
		  inUsers.close();
	}

}





