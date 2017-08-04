import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        
        int maxSum = Integer.MIN_VALUE;
        
        for(int a=0; a<4; a++) {
            for(int b=0; b<4; b++) {
                int sum = arr[a+0][b+0] + arr[a+0][b+1] + arr[a+0][b+2] + arr[a+1][b+1] + arr[a+2][b+0] + arr[a+2][b+1] + arr[a+2][b+2];
                
                maxSum = Math.max(maxSum, sum);
            }
        }
        
        System.out.println(maxSum);
        
    }
}
