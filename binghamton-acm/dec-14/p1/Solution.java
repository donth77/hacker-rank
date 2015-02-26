import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            String line = input.next();
            int value = Integer.parseInt(line);
            outputPattern(value);
        }
    }
    
    public static void outputPattern(int val){
        String pattern = "1";
        
        
        for(int i = 0; i < val; i++){
            int count = 0;
            
            System.out.println(pattern);
            String newPattern = "";
            
            for (int j = 0; j < pattern.length(); j++){
                char c = pattern.charAt(j); 
                
                if(j + 1 < pattern.length()){
                    char nextC = pattern.charAt(j + 1);
                        if(c == nextC){
                            count++;
                        }else{
                            count++;
                            newPattern = newPattern.concat(count + "" + c);
                            count = 0;
                        }
                }else{
                    count++;
                    newPattern = newPattern.concat(count + "" + c);
                    
                }
                
             }
            
            pattern = newPattern;
        }
    }
}
