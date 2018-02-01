import java.util.Scanner;
import java.util.InputMismatchException;
public class Exceptions3
{
	public static void main(String[] args)
	{
		System.out.println("Enter any amount of integers. Enter 0 to obtain sum");
		int total = sum();
		System.out.println(total);
	}
	public static int sum()
	{
		try{
		int s = 0;
		Scanner input = new Scanner(System.in);
		int current = input.nextInt();
		while(current != 0)
		{
			s = s + current;
			current = input.nextInt();
		}
			return s;
		}	
		catch(InputMismatchException e)
		{
			System.out.println("Not an integer, please try again.");
			
		}

return 0;

		
	}
}
