import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int lineNum = 0;
       long B = 0, W = 0, X = 0, Y = 0, Z = 0;
        
        while(input.hasNext()) {
                
		    	String line = input.nextLine();
  
                if(lineNum > 0){
                    String[] words = line.split(" ");
                    if(words.length == 2){
                        B = Long.parseLong(words[0]);
                        W = Long.parseLong(words[1]);;
                    }else{
                        X = Long.parseLong(words[0]);
                        Y = Long.parseLong(words[1]);
                        Z = Long.parseLong(words[2]);
                        System.out.println(findMinCost(B, W, X, Y, Z));
                    }

                }
            
                lineNum++;
		   }
    }
    
    public static long findMinCost(long B, long W, long X, long Y, long Z){
        long cost1 = 0, cost2 = 0;
        long minCost = 0;
        long convertVal = 0;

        if(X < Y){
            convertVal = W;
        }else{
            convertVal = B;
        }
        
        cost1 = B * X + W * Y;
        cost2 = (B + W) * Math.min(X, Y) + convertVal * Z;
        
        minCost = Math.min(cost1, cost2);
        
        return minCost;
    }
    
}
