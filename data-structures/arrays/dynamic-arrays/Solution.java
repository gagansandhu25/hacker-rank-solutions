import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>(N);
        for(int i = 0; i < N; i++){
            seqList.add(new ArrayList<Integer>());
        }
        
        int lastAnswer = 0;
        
        for(int i=0; i < Q; i++){
            int queryType = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            
            int seqNumber = ((x ^ lastAnswer) % N);
            if(queryType == 1) {
                seqList.get(seqNumber).add(y);
            } else if(queryType == 2) {
                y = y % seqList.get(seqNumber).size();
                lastAnswer = seqList.get(seqNumber).get(y);
                System.out.println(lastAnswer);
            }
        }
    }
}