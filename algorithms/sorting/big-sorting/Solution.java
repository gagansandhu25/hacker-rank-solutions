import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
        Arrays.sort(unsorted, new Comparator<String>() {
            @Override
            public int compare(String a, String b) 
            {
                if(a.length() > b.length()) {
                    return 1;
                } else if(a.length() < b.length()) { 
                    return -1;
                } else {
                    for(int k = 0; k < a.length(); k++)
                    {
                        if((int)a.charAt(k) > (int)b.charAt(k)) {
                            return 1;
                        } else if((int)a.charAt(k) < (int)b.charAt(k)) {
                            return -1;
                        } else { }
                    }
                }
                
                return 0;
            }
        });
        
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            System.out.println(unsorted[unsorted_i]);
        }
    }
}
