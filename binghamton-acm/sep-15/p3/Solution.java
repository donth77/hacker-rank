import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static ArrayList<String> foodItems = new ArrayList<String>();
    static ArrayList<Integer> foodItemScores = new ArrayList<Integer>();
    static ArrayList<ArrayList<String>> foodWords = new ArrayList<ArrayList<String>>();
    static ArrayList<String> foodOrders = new ArrayList<String>();

    public static void main(String[] args) {
        int lineNum = 0;
        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            String line = input.nextLine(); 
            lineNum++;
            if(lineNum > 1){
                String[] tokens = line.split("\\s+");
                if(tokens.length > 1){
                    foodItems.add(tokens[0]);
                    foodItemScores.add(0);
                    ArrayList<String> wordLine = new ArrayList<String>();
                    for(int i = 1; i < tokens.length; i++){
                        wordLine.add(tokens[i].toLowerCase());
                    }
                    foodWords.add(wordLine);
                }else{
                    if(!isInteger(line)){
                        foodOrders.add(line.toLowerCase());
                    }
                }
            }

        }
        int score = 0;


        for(int k = 0; k < foodOrders.size(); k++){
            for(int i = 0; i < foodWords.size(); i++){ 
                for(int j = 0; j < foodWords.get(i).size(); j++){ 
                    Pattern pattern = Pattern.compile("(" + foodWords.get(i).get(j) + ")");
                    Matcher matcher = pattern.matcher(foodOrders.get(k));
                    matcher.find();
                    try{
                        matcher.group(0);
                        score++;

                    }catch(Exception e ){
                    }
                }
                foodItemScores.set(i, score);
                score = 0;
            }
            int maxScore = -1;
            int maxIndex = -1;
            for(int i = 0; i < foodItemScores.size(); i++){
                if(foodItemScores.get(i) > maxScore){
                    maxScore = foodItemScores.get(i);
                    maxIndex = i;   
                }
            }
            int num = 0;
            for(int i = 0; i < foodItemScores.size(); i++){
                if(foodItemScores.get(i) == maxScore){
                    num++;
                }
            }
            if(num == 1){
                System.out.println(foodItems.get(maxIndex));
            }else{
                System.out.println("repeat that");
            }
        }

    }
    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }

}
