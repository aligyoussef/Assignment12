import java.util.Scanner;
import java.util.InputMismatchException;
public class Exceptions2
{
	static int sum = 0;
	static int track = 0;
	public static void main(String[] args)
	{
		
		System.out.println("Enter any amount of integers. Enter 0 to obtain sum");
		try{
			sum = total(sum);
			System.out.println("Sum of all is: " + sum);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Not an integer, please try again.");
			sum = track;
			sum = sum + total(track);
			
		}
		
	}
	public static int total(int s)
	{
		Scanner input = new Scanner(System.in);
		int current = input.nextInt();
		while(current != 0)
		{
			s = s + current;
			track = s;
			current = input.nextInt();
			
		}
			 System.out.println("S is: " + s);
			 
			
		
		
		return s;
	}
}