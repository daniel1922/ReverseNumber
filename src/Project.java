import java.util.Scanner;

public class Project 
{

	private static Scanner scanner;

	public static void main (String[] args){
		{	
		scanner = new Scanner(System.in);
		
		System.out.print("Enter a Number to Reverse :"); /*makes the # show up in console*/
		
		int original = scanner.nextInt(); /*assigns # user enters into scanner/ using 123 for our example*/
		int reverse = 0; /*reverse needs to initially be zero*/
		int remainder = 0; /*this will be used to initially rotate # in while loop*/
		
		while (original !=0) /* continues running loop until the statement is false*/
		{	
			remainder = original % 10; /* % strips down to a single # ex. 123 will becomes 1 after 3 loops */
			reverse = reverse * 10 + remainder; /* starts with 0 + remainder/ eventually completely reverses # */
			original = original / 10; /* removes a digit each loop and assigns new # back to while loop */
	
		}	
		System.out.println("reverse number is :" + reverse); /*makes the new reverse # show up in console*/
		
		}
}}
				
	
	
	
	
