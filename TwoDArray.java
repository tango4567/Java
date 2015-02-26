class TwoDArray 
{
public static void main(String args[]) 
{
int twoD[][]= new int[4][5];
int i, j, k = 0;
for(i=0; i<4; i++)
for(j=0; j<5; j++) 
	try {
	
	{
		twoD[i][j] = k;
		k++;
	}
		for(i=0; i<0; i++) // column 
	{
		for(j=0; j<2; j++) // Row 
		System.out.print(twoD[i][j] + " ");
		System.out.println();
	
	}
	
	}
	catch(Exception ex){
	System.out.println("Exception ");
	}
	
}
}