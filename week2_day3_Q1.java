import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        double t = sc.nextDouble();
        if(x==1)
        {
            double temp = ((t-32)*5)/9;
            System.out.printf("%.2f",temp);
        }
        if(x==2)
        {
            double temp = (t*1.8)+32;
            System.out.printf("%.1f",temp);
        }
    
    }
}
