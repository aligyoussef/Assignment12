import java.util.Scanner;
import java.util.InputMismatchException;
public class MismatchEx
{
	static int num1 = 0;
	static int num2 = 0;
	static int sum = 0;
	public static void main(String[] args)
	{
		try{
        
			getInput();
			
		
		}
		catch (InputMismatchException e)
		{
			System.out.println("Non-integer detected, please try again.");
        
			getInput();
		}
	}

	public static int getInput()
	{
		 Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the first integer: ");
		 num1 = input.nextInt();
       
       System.out.println("Enter the second integer: ");
		 num2 = input.nextInt();
       
		 sum = num1 + num2;
       
       System.out.println(num1 + " + " + num2 + " = " + sum);
		return sum;
		
	}
}