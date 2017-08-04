import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionWithArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        
        int seqList[][] = new int[N][Q];
        int lastAnswer = 0;
        int nextIndexesOfSeq[] = new int[N];
        
        int queriesList[][] = new int[Q][3];
        
        for(int i=0; i < Q; i++){
            for(int j=0; j < 3; j++){
                queriesList[i][j] = in.nextInt();
            }
            
            int seqNumber = ((queriesList[i][1] ^ lastAnswer) % N);
            if(queriesList[i][0] == 1) {
                seqList[seqNumber][nextIndexesOfSeq[seqNumber]] = queriesList[i][2];
                nextIndexesOfSeq[seqNumber]++;
            } else if(queriesList[i][0] == 2) {
                int y = queriesList[i][2] % seqList[seqNumber].length;
                lastAnswer = seqList[seqNumber][y];
                System.out.println(lastAnswer);
            }
        }
    }
}