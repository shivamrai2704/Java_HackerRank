import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        double x,y,z;
        double d=0.0;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        
        if (x>0 && y>0 && z>0)
        {
            d=(x+y+z)/3;
            
            System.out.printf("%.1f", d-0.1);    
        }

        else  
        {
            System.out.println("Invalid Input");
        }
    }
}
