import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i=a;i>0;i--) 
            {int count=1;
            for(int j=i;j>0;j--)
                {
                
                System.out.print(count+" ");
            count++;
                }
            System.out.println();
            
        }
    }
}
