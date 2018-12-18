package algo;
import java.util.ArrayList;

//This is the template for the onjects which will contain a String Val and a Weight
public class Term {
	public String value;
	public double weight;
    
	//constructor
	public Term(double weight, String theTerm)
	{
		this.weight = weight;
		this.theTerm = theTerm;
	}


	@Override
	public boolean equals(final Object obj)
	{
		if (obj instanceof Term)
		{

			final Term other = (Term) obj;
			return Objects.equal(this.theTerm, other.theTerm);
		}
		else
		{
			return false;
		}
	}

	@Override
	public String toString()
	{
		return toStringHelper(this).addValue(weight)
				.addValue(theTerm).toString();

	}
    

}

