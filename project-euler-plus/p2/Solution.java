import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long lineNum = 0;
        
        while(input.hasNext()) {
		    	String nextInput = input.next();
  
                if(lineNum > 0){
                    System.out.println(evenFib(Long.parseLong(nextInput)));
                }
            
                lineNum++;
		   }
    }
    
       public static long evenFib(long n){
           	long sum = 0;
	       	long a = 1;
	       	long b = 1;
	       	long c = a + b;
	       	while (c < n){
	       		 sum = sum + c;
 				 a = b + c;
 				 b = c + a;
 				 c = a + b;

	       	}
	       	return sum;
        }
}
