import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //File file = new File(args[0]);
        //Scanner input = new Scanner(file);
        Scanner input = new Scanner(System.in);

        boolean elon = true;
        
        ArrayList<String> elonCards = new ArrayList<String>();
        
        ArrayList<String> patrickCards = new ArrayList<String>();
        
        ArrayList<String> removeCards = new ArrayList<String>();
            
        
        while(input.hasNext()) {
		    	String nextToken = input.next();
            
                if(nextToken.equals("Elon")){
                    elon = true;
                }else if(nextToken.equals("Patrick")){
                    elon = false;
                }else{
                    if(elon){
                        elonCards.add(nextToken);
                    }else{
                        patrickCards.add(nextToken);
                    }
                }
            
		    	String nextLine = input.nextLine();

		    }
        
            if(elonCards.size() > patrickCards.size()){
                 for(int i = 0; i < patrickCards.size();i++){
                    if(elonCards.contains(patrickCards.get(i))){
                        removeCards.add(patrickCards.get(i));
                    }
                 }
            }else{
                 for(int i = 0; i < elonCards.size();i++){
                    if(patrickCards.contains(elonCards.get(i))){
                        removeCards.add(elonCards.get(i));
                    }
                 }
            }
        
            for(int i = 0; i < removeCards.size();i++){
                if(elonCards.contains(removeCards.get(i))){
                    elonCards.remove(removeCards.get(i));
                }
                
                if(patrickCards.contains(removeCards.get(i))){
                    patrickCards.remove(removeCards.get(i));
                }
            }
        
                
           System.out.println("Elon will offer: ");
            for(int i = 0; i < elonCards.size();i++){
                System.out.println(elonCards.get(i));
            }
        
        
           System.out.println("\nPatrick will offer: ");
           for(int i = 0; i < patrickCards.size();i++){
                System.out.println(patrickCards.get(i));
            }
        
        
    }
}
