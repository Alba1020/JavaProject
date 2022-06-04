
public class Main {

	public static void main(String[] args) 
	{
		ChatBot tom = new ChatBot("Tom", 40.0, "Rowdy");
		//tom.setName("Tom");
		//tom.setWeight(40.0);
		//tom.setQuirk("Rowdy");
		tom.interact();
		
		ChatBot jerry = new ChatBot();
		jerry.setName("Jerry");
		jerry.setWeight(3.0);
		jerry.setQuirk("Happy");
		jerry.interact();
		
		
		System.out.println(jerry.toString());

	}

}

//encapsulation 
//information hiding (private) hide away information from most classes so only the needed
//classes can access information