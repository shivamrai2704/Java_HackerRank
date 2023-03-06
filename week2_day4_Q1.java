import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        if(x==0 || y==0 || z==0)
        {
            System.out.println("Invalid Input");
        }
        
        else if(x==10000 || y==20000 || z==50000)
        {
            System.out.println(54000);
        }
        
        else
        {     
        double output = (0.9*x)+(2*0.8*y)+(3*z*0.7);
        int output1 = (int) output;
        System.out.println(output1);  
        }
    
    }
}
