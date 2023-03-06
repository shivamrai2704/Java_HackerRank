
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
        Scanner sc=new Scanner(System.in);
         String y=sc.nextLine();
        
        int x=Integer.parseInt(y, 2);
        if (x<65||x>90) {
            System.out.println("INVALID PAPER CODE");
     
        } else {
            System.out.println((char)x);
              }
    }
}

    
    
