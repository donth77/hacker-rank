import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            String line = input.nextLine(); 
            String[] tokens = line.split("\\s+");
            isNarcNumber(tokens[0]);
        }
    }
	
	public static void isNarcNumber(String number){
		long value = Long.parseLong(number);
		int k = number.length();
		long sum = 0;
		for (int i = 0; i < number.length(); i++){
			char c = number.charAt(i);       
			long digitValue = Integer.parseInt(String.valueOf(c));
			sum += Math.pow(digitValue, k);
			
		}
		
		if(sum == value){
            		System.out.println("True");
        	}else{
            		System.out.println("False");
        	}
        
	}
}
