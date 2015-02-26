import java.util.Scanner;
class Bits4{ 
   public static void main(String args[]){
      System.out.println(" ^ OR opeartor");

// apply the & operator

		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter first value");
		int b = sc.nextInt();
		System.out.println("\n Enter second value ");
		int c = sc.nextInt();
      int x = b^c;
       System.out.println("\n Value one "+b+"^"+c+ " Value Two = "+x);
 }   }
