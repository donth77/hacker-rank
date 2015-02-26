import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static double a = -1, b = -1,c = -1, A = -1, B = -1, C = 90.0;

    public static void main(String[] args) {
        int lineNum = 0;
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            String line = input.next();
            lineNum++;
            if(lineNum > 1){
                String[] tokens = line.split("=");
                    switch(tokens[0]){
                        case "a":
                            a = Double.parseDouble(tokens[1]);
                            break;
                        case "b":
                             b = Double.parseDouble(tokens[1]);
                            break;                        
                        case "c":
                             c = Double.parseDouble(tokens[1]);
                            break;                        
                        case "A":
                            A = Double.parseDouble(tokens[1]);
                            break;                        
                        case "B":
                             B = Double.parseDouble(tokens[1]);
                            break;                                            
                    }
                
                //System.out.println(tokens[1]);
            }
        }
        
        calculateRatios();
    }
    
    public static void calculateRatios(){
        if(a == -1){
            a = Math.sqrt(c * c - b * b);
        }else if(b == -1){
            b = Math.sqrt(c * c - a * a);
        }else if(c == -1){
            c = Math.sqrt(a * a + b * b);
        }
        
        if(A == -1){
            A = Math.toDegrees(Math.asin(a / c));
        }
        
        if(B == -1){
            B = Math.toDegrees(Math.asin(b / c));
        }
        
        System.out.printf("a=%.2f", a);
        System.out.printf("\nb=%.2f", b);
        System.out.printf("\nc=%.2f", c);
        
        System.out.printf("\nA=%.2f", A);
        System.out.printf("\nB=%.2f", B);
        System.out.printf("\nC=%.2f", C);
            
        
    
    }
}
