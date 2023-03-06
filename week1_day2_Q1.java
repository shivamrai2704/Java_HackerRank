import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        int nonprime=0;

        for(int i=2; i<=Math.sqrt(x); i++)

        {

            if(x%i==0)

                nonprime++;

        }

        if(nonprime==0)

            System.out.println("Prime Number");

        else

            System.out.println("Not Prime Number");
        
    
    }
}
