import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionSlow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
        for(int i=0; i<n; i++) {
            int j = i+1;
            
            while(j < n) {
                
                boolean doSwap = false;
                
                if(unsorted[i].length() > unsorted[j].length()) {
                    doSwap = true;
                } else if(unsorted[i].length() < unsorted[j].length()) { } else {
                    for(int k = 0; k < unsorted[i].length(); k++)
                    {
                        if((int)unsorted[i].charAt(k) > (int)unsorted[j].charAt(k)) {
                            doSwap = true;
                        } else if((int)unsorted[i].charAt(k) < (int)unsorted[j].charAt(k)) {
                            break;
                        } else {
                            continue;
                        }
                    }
                }
                
                if(doSwap) {
                    String temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
                
                j++;
            }
            
            
        }
        
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            System.out.println(unsorted[unsorted_i]);
        }
    }
}
