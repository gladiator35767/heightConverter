import java.util.Scanner;

public class heightConverter
	{
		static Scanner userInput;
		static Scanner userInput1;
		static double usInch;
		
		public static void main(String[] args)
			{
			double inFeet = inputFeet();
			inputInches();
			double inches = convertToInches(inFeet);
			double centimeters = convertToCentimeters(inches);
			double meters = convertToMeters(centimeters);
			double feet = convertToFeet(meters);
			double conInch = revertBackToInches(feet);
			}
				
	    public static double inputFeet()
	    	{
		     userInput =new Scanner(System.in);
		     System.out.println("How tall are you in feet?");
	       	 return userInput.nextDouble();
	    	}
	    
	    public static void inputInches()
	    {
	        userInput1 = new Scanner(System.in);
	        System.out.println("Plus how many inches?");
	        usInch = userInput.nextDouble();
        }
	    public static double convertToInches (double numberOfFeet)
	    {
	    	double inches = numberOfFeet * 12;
	    	double inchFull = usInch + inches;
	    	System.out.println("Your height in inches: " + inchFull);
	    	return inchFull;
	    }
	    public static double convertToCentimeters(double numberOfInches)
	    {
	    	double inches = numberOfInches * 2.54;
	    	System.out.println("YOur height in centimeters: " + centimeters);
	    	return centimeters;
	    }
	    public static double convertToMeters(double numberOfCentimeters)
	    {
	    	double meters = numberOfCentimeters / 100;
	    	System.out.println("Your height in meters: " + meters);
	    	return meters;	
        }
	    public static double convertToFeet(double numberOfMeters)
	    {
	    	double feet = numberOfMeters * 3.28084;
	    	System.out.println("Your height in feet: " + feet);
	    	return feet;
	    }
	    public static double revertBackToInches(double revertBackToInches)
	    {
	    	double conInch = revertBackToInches * 12;
	    	System.out.println("Your height in inches: " + conInch);
	    	return conInch;
	    	
	    }
	   
	}
