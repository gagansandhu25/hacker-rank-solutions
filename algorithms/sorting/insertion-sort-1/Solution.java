import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        int unsortedNumber = ar[ar.length - 1];
        
        for(int i=ar.length-1; i>=0;i--) {
            
            if(i > 0 && ar[i-1] > unsortedNumber) {
                ar[i] = ar[i-1];
            } else if(i > 0 && ar[i-1] <= unsortedNumber) {
                ar[i] = unsortedNumber;
                printArray(ar);
                break;
            } else if(i == 0 && ar[0] > unsortedNumber) {
                ar[0] = unsortedNumber;
            }
            
            printArray(ar);
            
        }
        
        
        
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
