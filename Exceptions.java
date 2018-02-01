import java.util.Scanner;
public class Exceptions
{
	public static void main(String[] args)
	{
		System.out.println("Enter any amount of integers. Enter 0 to obtain sum");
		int sum = 0;
		Scanner input = new Scanner(System.in);
		int current = input.nextInt();
		while(current != 0)
		{
			sum = sum + current;
			current = input.nextInt();
		}
		System.out.println(sum);
	}
	
		
		
			
			
		

		
	
}