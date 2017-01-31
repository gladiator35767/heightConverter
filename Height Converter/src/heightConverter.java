import java.util.Scanner;

public class heightConverter
	{
		static Scanner userInput;
		static Scanner userInput1;
		
		public static void main(String[] args)
			{
			double feet = inputFeet();
			double inches = plusInches(feet);
			
			}
				
	    public static double inputFeet()
	    	{
		     Scanner userInput =new Scanner(System.in);
		     System.out.println("How tall are you in Feet?");
	       	 return userInput.nextDouble();
	    	}
	    
	    public static double plusInches(double feet)
	        {
	        Scanner userInput1 = new Scanner(System.in);
	        System.out.println("Plus how many inches?");
	        return userInput1.nextDouble();
	        }
	    
	   
	}
