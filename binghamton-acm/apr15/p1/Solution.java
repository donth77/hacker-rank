import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        int lineNum = 0;
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            String line = input.nextLine(); 
            lineNum++;
            if(lineNum >  1){
                String[] tokens = line.split("\\s+");
                int val = Integer.parseInt(tokens[0]);
                double convertVal = 0.0;
                double roundVal  = 0.0;
                String unit = tokens[1];
                System.out.print(lineNum - 1 + " ");
                if(unit.equals("mi")){
                    convertVal = (double)  val * 1.60934;
                    roundVal = Math.round(convertVal * 10000.0)/10000.0;
                    System.out.println((String.format("%.4f",roundVal)) + " km");
                }else if(unit.equals("km")){
                    convertVal = (double)  val * 0.621371;
                     roundVal =  Math.round(convertVal * 10000.0)/10000.0;
                          System.out.println((String.format("%.4f",roundVal)) + " mi");
                }else if(unit.equals("m")){
                    convertVal = (double)  val * 3.28084;
                     roundVal =  Math.round(convertVal * 10000.0)/10000.0;
                          System.out.println((String.format("%.4f",roundVal)) + " ft");
                }else if(unit.equals("ft")){
                     convertVal = (double)  val * 0.3048;
                      roundVal = Math.round(convertVal * 10000.0)/10000.0;
                    System.out.println((String.format("%.4f",roundVal)) + " m");
                }

            }
                                  
           
            }
        }

    }

	
