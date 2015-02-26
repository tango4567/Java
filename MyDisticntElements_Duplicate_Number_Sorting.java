import java.util.Scanner;

 class MyDisticntElements_Duplicate_Number_Sorting {
 
    public static void printDistinctElements(int[] arr){
         
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }
     
    public static void main(String a[]){
         
			int c,n,intet, nums[];
			System.out.println("Enter number of elements");
			Scanner in = new Scanner(System.in);
			n = in.nextInt(); 
			nums = new int[n];
		 
			System.out.println("Enter " + n + " integers");
		 
		 
			for (c = 0; c < n; c++)
			  nums[c] = in.nextInt();
		 
			System.out.println("You entered following value to find");
			
			
        MyDisticntElements_Duplicate_Number_Sorting.printDistinctElements(nums);
    }
}