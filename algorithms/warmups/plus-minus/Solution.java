import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
            if(arr[arr_i] > 0) positiveCount++;
            else if(arr[arr_i] < 0) negativeCount += 1;
            else if(arr[arr_i] == 0) zeroCount += 1; 
        }
        
 
        System.out.printf("%.6f", (positiveCount/(float) n));
        System.out.println();
        
        System.out.printf("%.6f", (negativeCount/(float) n));
        System.out.println();
        
        System.out.printf("%.6f", (zeroCount/(float) n));
    }
}
