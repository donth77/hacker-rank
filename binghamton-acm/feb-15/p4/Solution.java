import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int N = 0;
    static ArrayList<ArrayList<String>> grid = new ArrayList<ArrayList<String>>();

    public static void main(String[] args) {
        int lineNum = 0;
        Scanner input = new Scanner(System.in);

        
        while(input.hasNext()){
            String line = input.nextLine(); 
            lineNum++;
            if(lineNum == 1){
                N = Integer.parseInt(line);
            }else{
                ArrayList<String> row = new ArrayList<String>();
                String[] tokens = line.split("");
                for(int i = 1; i < tokens.length; i++){
                    row.add(tokens[i]);
                }
                grid.add(row);
			}
            
        }
        
        //iin the case of a blank line but the grid is not done being created
        while(lineNum <= N){
            lineNum++;
            String line = "";
            for(int i = 0; i < N ; i++){
                line = line.concat(" ");
            }
            ArrayList<String> row = new ArrayList<String>();
            String[] tokens = line.split("");
            for(int i = 1; i < tokens.length; i++){
                 row.add(tokens[i]);
             }
                grid.add(row);
            
        }

        gravityFalls();
        
        for(int i = 0; i < grid.size(); i++){
            for(int j = 0; j < grid.get(i).size(); j++){
                System.out.print(grid.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    public static void gravityFalls(){
        int row = grid.size();
        for(int i = 0; i < row; i++){
            int col = grid.get(i).size();
            for(int j = 0; j < col; j++){
                String currSpace = grid.get(i).get(j);
                if(i < (col - 1)){
                    String lowerSpace = grid.get(i + 1).get(j);
                    if((!(currSpace.equals(" "))) && !(currSpace.equals("#")) && lowerSpace.equals(" ") && (!(lowerSpace.equals("#")))){
                        grid.get(i).set(j, " ");
                        grid.get(i + 1).set(j, ".");
                    }
                }
            }
        }
    }
    
}
	
