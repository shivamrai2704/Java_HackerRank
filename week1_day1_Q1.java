// Q1

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int x,y;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        if (x>0 && y>0)
        {
            
            System.out.println(x + "-" + y);
        }

        else  
        {
            System.out.println("Invalid Input");
        }    
    
    }
}
