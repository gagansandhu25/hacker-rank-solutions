import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long sumMin = Long.MAX_VALUE;
        long sumMax = 0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            long sum = 0;
            for(int arr_j=0; arr_j < 5; arr_j++) {
                if(arr_j == arr_i) continue;
                
                sum += arr[arr_j];
            }
            
            
            if(sum > sumMax) {
                sumMax = sum;
            } 
            if(sum < sumMin) {
                sumMin = sum;
            }
        }
        
        System.out.println(sumMin + " " + sumMax);

    }
}
