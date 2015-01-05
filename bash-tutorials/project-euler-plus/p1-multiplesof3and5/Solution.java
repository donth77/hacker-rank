import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNum = 0;
        
        while(input.hasNext()) {
		    	String nextInput = input.next();
            
                if(lineNum > 0){
                    System.out.println(Long.valueOf(SumOfMultsOf3And5(Long.parseLong(nextInput))));
                }    
            
                lineNum++;
		   }
        
    }
    
    public static long SumOfMultsOf3And5(long val){
        val--;
        return SumDivisibleBy(val, 3) + SumDivisibleBy(val, 5) - SumDivisibleBy(val, 15);
    }
    
    public static long SumDivisibleBy(long target, int n){
        long p = (long) (target / n);
        return (long) (n * (p * (p + 1)) / 2);
    }
}
