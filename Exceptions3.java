import java.util.Scanner;
import java.util.InputMismatchException;
public class Exceptions3
{
	static int track = 0;
	public static void main(String[] args)
	{
		int total = 0;
		System.out.println("Enter any amount of integers. Enter 0 to obtain sum");
		try{
		 	total = sum();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not an integer, please try again.");
			//System.out.println(track);
		}

		System.out.println("Sum is: " + track);
	}
	public static int sum()
	{
		
		int s = 0;
		Scanner input = new Scanner(System.in);
		int current = input.nextInt();
		while(current != 0)
		{
			s = s + current;
			track = s;
			current = input.nextInt();
		}
			return s;
			
		



		
	}
}