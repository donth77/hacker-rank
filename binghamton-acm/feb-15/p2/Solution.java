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
            Set<Long> set = new HashSet<Long>();
            if(lineNum > 1){
                String[] tokens = line.split("\\s+");
				for(int i = 1; i < tokens.length; i++){
                     set.add(Long.parseLong(tokens[i]));
                }
                                  
             List sortedList = new ArrayList(set);
             Collections.sort(sortedList, Collections.reverseOrder());
             System.out.println(tokens[0] + " " + sortedList.get(3));
            }
        }

    }

	
}
