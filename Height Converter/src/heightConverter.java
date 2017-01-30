import java.util.Scanner;

public class heightConverter
	{

		public static void main(String[] args)
			{
			double feet = inputFeet();
			double inches = inputInches();
			double height = totalHeight();
			double number of feet = convertToInches(total);
			double centimeters = convertToCentimeters();
			double meters = convertToMeters();
			double convertFeet = outputFeet();
			double convertInches = outputInches();
			}
				
	    public static double inputFeet()
	    	{
		     Scanner userInput =new Scanner(System.in);
		     System.out.println("How tall are you in Feet?");
	       	 return userInput.nextDouble();
	    	}
	    
	    public static double inputInches()
	        {
	        Scanner userInput =new Scanner(System.in);
		    System.out.println("Plus how many inches?");
		    return userInput.nextDouble();
	        }
	    public static double convertToInches(double numberOfFeet)
		    {
		    	double inches = numberOfFeet * 12;
		    }
	    public static double convertToCentimeters()
		    {
		    	
		    }
	    public static double convertToMeters()
		    {
		    	
		    }
	    public static double outputFeet()
		    {
		    	
		    }
	    public static double outputInches()
		    {
		    	
		    }
}