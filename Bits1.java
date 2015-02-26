import java.util.Scanner;
class Bits1{ 
   public static void main(String args[]){
      System.out.println("\n ~ NOT opeartor");

// invert 0
      System.out.println("\n ~ 0 = "+~0); 

// invert 11
Scanner sc = new Scanner(System.in);
System.out.println("\n Enter value");
int x = sc.nextInt();
      System.out.println("You entered "+x+" And New Value is "+ ~x);
    }
}
