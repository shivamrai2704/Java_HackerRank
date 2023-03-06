import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        Scanner input=new Scanner(System.in);
        
        int x=input.nextInt();
        if(x<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            double d=(double) x;
        	System.out.println(d);
        }
        
    }
}
