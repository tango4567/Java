package sowmitras.registration;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Tarun Mahajan on 17/2/17.
 * Developer Team Sowmitras TechnoSoft Solution
 */

public class ArraySort{

   static int a[]={-1,3,15,7,9,-90};
   static int[] positive;
   static int count=0, temp;
    
    public static void main(String[] args){

        //TODO:step one
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                temp = a[i];
                Log.i("Single Positive", "" + temp);
                count++;
            }
        }

        //TODO:step two
        Log.i("Total Positive", "" + count);
        positive = new int[count];

        //TODO:step three
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                for (int j = 0; i <= positive.length; i++) {
                    int values = a[i];
                    positive[j] = values;
                    Log.i("Array values", "" + positive[j]);

                    Arrays.sort(positive);
                    for (int number : positive) {
                        Log.i("Number = ", "" + number);
                    }
                }
            }
        }
    }
}
