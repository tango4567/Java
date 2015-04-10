import java.util.Scanner;
class Calculate{  
  static int cube(int x){  
  return x*x*x;  
  }  
  
  public static void main(String args[]){ 
  System.out.println("Enter The Number = ");
  Scanner scan = new Scanner(System.in);
  int p_height = scan.nextInt();
  int result=Calculate.cube(p_height);  
  System.out.println(result);  
  }  
}  