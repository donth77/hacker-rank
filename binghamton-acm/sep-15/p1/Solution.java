import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static ArrayList<Integer> scores = new ArrayList<Integer>();
    static ArrayList<String> names = new ArrayList<String>();
    
    static ArrayList<String> maxNames = new ArrayList<String>();
    
    public static void main(String[] args) {
        int lineNum = 0;
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            String line = input.nextLine(); ;
            lineNum++;
            if(lineNum >  1){
                String[] tokens = line.split("\\s+");
                names.add(tokens[0]);
                scores.add(Integer.parseInt(tokens[1]));
            }
                                  
        }
        int maxScore = -1;
        int maxIndex = -1;
        for(int i = 0; i < scores.size(); i++){
            if(scores.get(i) > maxScore){
                maxScore = scores.get(i);
                maxIndex = i;   
            }
        }
        for(int i = 0; i < scores.size(); i++){
            if(scores.get(i) == maxScore){
                maxNames.add(names.get(i));  
            }
        }
        if(maxNames.size() == 1){
            System.out.println(names.get(maxIndex) + " has the high score of " + maxScore);
        }else if(maxNames.size() == 2){
            System.out.println(maxNames.get(0) + " and " +  maxNames.get(1) + " have the high score of " + maxScore);
        }else{
            for(int i = 0; i < maxNames.size() - 1; i++){
                System.out.print(maxNames.get(i) + ", ");
            }
            System.out.print("and " + maxNames.get(maxNames.size() - 1) + " have the high score of " + maxScore);
            System.out.println();
        }
    }

}
