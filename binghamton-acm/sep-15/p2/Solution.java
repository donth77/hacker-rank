import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static ArrayList<String> alexStuffList = new ArrayList<String>();
    static ArrayList<String> adamStuffList = new ArrayList<String>();
    static Set<String> finalList = new HashSet<String>();
    
    public static void main(String[] args) {
        int lineNum = 0;
        Scanner input = new Scanner(System.in);
        boolean reachedAdam = false;
        
        while(input.hasNext()){
            String line = input.nextLine(); 
            lineNum++;
            if(!line.equals("END")){
                if(lineNum > 1 && !reachedAdam && !line.equals("Adam")){
                    String[] alexStuff = line.split("\\s+");
                    for(int i = 0; i < alexStuff.length; i++){
                       alexStuffList.add(alexStuff[i]);
                    }
                }
                if(line.equals("Adam")){
                    reachedAdam = true;
                }
                if(reachedAdam && !line.equals("Adam") ){
                    String[] adamStuff = line.split("\\s+");
                    for(int i = 0; i < adamStuff.length; i++){
                       adamStuffList.add(adamStuff[i]);
                    }
                }
            }
        }
        finalList.addAll(alexStuffList);
        finalList.addAll(adamStuffList);
        List sortedList = new ArrayList(finalList);
        Collections.sort(sortedList);
        System.out.print(sortedList.size()+ " {");
        for(int i = 0; i < sortedList.size() - 1; i++){
            System.out.print(sortedList.get(i) +", ");
        }
        System.out.print(sortedList.get(sortedList.size() - 1) +"}");
        System.out.println();
    }

}
