import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static ArrayList<String> sortedList = new ArrayList<String>();

    public static void main(String[] args) {
        int lineNum = 0;
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            String line = input.next();
            lineNum++;
            if(lineNum > 1){
                findSubstringsAndSort(line);
                countAnagramPairs();
            }
            sortedList.clear();
        }
  
    }
    
    public static void countAnagramPairs(){
        int size = sortedList.size();
      
        ArrayList<String> repeatList = new ArrayList<String>();
        
        for(int i = 0; i < size; i++){
           for(int j = i + 1; j < size; j++){
               if(sortedList.get(i).equals(sortedList.get(j))){
                   repeatList.add(sortedList.get(i));
               }
           }
        }
        
        System.out.println(repeatList.size());

    }
    
    public static void findSubstringsAndSort(String s)	{
        int i, c;
        
        for(c = 0 ; c < s.length() ; c++)
        {
            for(i = 1 ; i <= s.length() - c ; i++)
            {
                String sub = s.substring(c, c + i);
                sortedList.add(sortSubString(sub));
             }
         }
        
	}
    
    public static String sortSubString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}
