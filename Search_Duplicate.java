import java.util.Scanner;
class Remove_Duplicates
{
 void remove(String s)
    {
        int l=s.length();
        int c;
        String org=s,  s1=" ";
        for(int i=0;i<(l-1);i++)
        {
            s1=s.substring(0,i+1);
            c=0;
            for(int j=i+1; j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    c++;
                    continue;
                }
                else
                    s1=s1+s.charAt(j);
            }
            s=s1;
            s1=" ";
            if(c>0)
                l-=c;
        }
		System.out.println("\n Original String:  "+org);
		System.out.println("\n String after removing duplicates:  "+s);
	}
}
class Search_Duplicate
{
public static void main(String[] args) throws Exception
{
	String first_string, second_string;
	
	Remove_Duplicates rd = new Remove_Duplicates();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("\n Enter a String For Short Form \n");
	first_string = sc.nextLine();
	rd.remove(first_string);
}
}