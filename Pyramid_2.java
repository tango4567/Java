import java.util.Scanner;
class Pyramid_2
{
public static void main (String [] args)
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter Height of Pyramid = ");
int p_height = scan.nextInt();
int min_star=1;

int p_space=p_height-1;

int i,j,k;
for (i=0;i<p_height;i++)
{
for(j=p_space;j>i;j--)
		{
		System.out.print(" ");
		}
		for(k=0;k<min_star;k++)
		{
		System.out.print("*");
		}


		
min_star+=2;
System.out.println();
}

}
}