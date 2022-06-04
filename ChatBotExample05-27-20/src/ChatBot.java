
public class ChatBot 
{

	//instance variables (attributes)
	private String name = "";
	private double weight = 0.0;
	private String quirk = "";
	
	ChatBot()
	{
		
	}//default constructor
	
	ChatBot(String newName)
	{
		name = newName;
	}//custom constructor with one string parameter(for name)
	
	ChatBot(String newName,double newWeight,String newQuirk)
	{
		name = newName;
		weight = newWeight;
		quirk = newQuirk;
	}//customer constructor that takes 3 parameters 
	
	public void interact()
	{
		System.out.printf("You interacted with %s.\n", name);
	}//end function
	
	//setters functions and getter functions
	//they set the value of an instance variable and get the value
	
	//setters
	public void setName(String newName)
	{
		name = newName;
	}//end function
	
	public void setWeight(double newWeight)
	{
		weight = newWeight;
	}//end function
	
	public void setQuirk(String newQuirk)
	{
		quirk = newQuirk;
	}//end function
	
	//getters
	public String getName()
	{
		return name;
	}//end function
	
	public double getWeight()
	{
		return weight;
	}//end function
	
	public String getQuirk()
	{
		return quirk;
	}//end function
	
	@Override
	public String toString()
	{
		
		return "Name: " + name + ";    Weight: " + weight + ";    Quirk: " + quirk;
	}//end function
	
	
}//end class
