import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionRaw {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            long[] ar = new long[n];
            for(int j=0;j<n;j++){
                ar[j]=in.nextLong();
            }
            long c = insertSort(ar);      
            System.out.println(c);
        }
    }
    
    
    public static long insertSort(long[] ar)
    {
        long count = 0;
        
        for(int i=0; i<ar.length; i++) {
            int j = i+1;
            
            while(j < ar.length) {
                
                if(ar[j] < ar[i]) {
                    long temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                    count++;
                }
                
                j++;
            }
        }
        
        return count;
        
    }
    
   
    
    
}
