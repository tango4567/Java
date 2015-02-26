import java.util.Scanner;
class PalindromeNumber
{
 public static void main(String args[])throws Exception
 {
  int number = 0;
  int reverse = 0;
  int numCopy = 0; 

  System.out.println("Enter a number to check if it is a Palindrome");

  Scanner in = new Scanner(System.in);
  number = in.nextInt();
  numCopy = number;

  while(numCopy > 0)
  {
   int digit = numCopy % 10; 
   numCopy = numCopy / 10;
   reverse = (reverse * 10) + digit;
  }
  
try{
	System.out.println("\nValue of reverse number is  "+reverse);	
	if(number == reverse)
	   System.out.println("\nThe number "+number+" is a Palindrome.");
	  else 
	   System.out.println("\nThe number "+number+" is not a Palindrome.");
	
  }
   
catch(Exception e)
			{
					System.out.println("\nException Found"+e);
			}
finally
	{
	int total=0;
	total = number + reverse;
		System.out.println("\nFinal Result is "+total)	;		
	}	
	}
}