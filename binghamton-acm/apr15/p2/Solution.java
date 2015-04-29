import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        int lineNum = 0;
        Scanner input = new Scanner(System.in);
        String str1 = "", str2 = "";
        
        while(input.hasNext()){
            String line = input.nextLine(); 
            lineNum++;
            if(lineNum ==  1){
                str1 = line;

            }else if(lineNum == 2){
                str2 = line;
            }
                                  
           
            }
          System.out.println(lcs(str1, str2));
        }

    public static String lcs(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
 
        int[][] arr = new int[l1 + 1][l2 + 1];
 
        for (int i = l1 - 1; i >= 0; i--)
        {
            for (int j = l2 - 1; j >= 0; j--)
            {
                if (str1.charAt(i) == str2.charAt(j)){
                    arr[i][j] = arr[i + 1][j + 1] + 1;
                } else{ 
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
                }
            }
        }
 
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer();
        while (i < l1 && j < l2) 
        {
            if (str1.charAt(i) == str2.charAt(j)) 
            {
                sb.append(str1.charAt(i));
                i++;
                j++;
            }
            else if (arr[i + 1][j] >= arr[i][j + 1]) {
                i++;
            } else{
                j++;
            }
        }
        return sb.toString();
    }
}
