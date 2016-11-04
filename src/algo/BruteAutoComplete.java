package algo;


import java.io.FileNotFoundException;
import java.util.ArrayList;


public class BruteAutoComplete implements AutoComplete 
{

	ArrayList<Term> listOfTerms = new ArrayList<>();
	private double WeightResult;
	private String ValueResult;
	Reader reader = new Reader();


	public  BruteAutoComplete() 
	{
		try 
		{
			listOfTerms = reader.addTerms();
		} 
		catch (FileNotFoundException e) {
			System.out.println("error");
		}
	}
	
	@Override
	public double weightOf(String inputTerm) 
	{

		if (inputTerm != null) 
		{

			for (Term t : listOfTerms) 
			{

				if (t.value.toLowerCase().equals(inputTerm.toLowerCase()))
				{
					WeightResult =  t.weight;	
				}
			}
		}
		else
		{
			return 0.0;
		}

		return WeightResult;
	}	
	

	@Override
	public String bestMatch(String prefix) 

	{
		int count = 1;
		for (Term t : listOfTerms) 
		{
			if (t.value.toLowerCase().startsWith(prefix) && count ==1)
			{
				ValueResult =  t.value;  
				count--;
			}
		}
		return ValueResult;
	}
	
	@Override
	public Iterable<String> matches(String prefix, int k) 
	{
		ArrayList<String> colection = new ArrayList<>();
		int counter = 0;

		for (Term t : listOfTerms) 
		{
			if (t.value.toLowerCase().startsWith(prefix) && counter++ < k)
			{
				colection.add(t.value);

			}
		}

		return colection;

		
	}

}



