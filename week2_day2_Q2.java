import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc = new Scanner(System.in);
        
    double in = sc.nextDouble();
    int inputInt = (int) in;
    if (inputInt >= 1 && inputInt <= 5) 
    {
     	System.out.println("Thanks");
    } 
    else 
    {
     	System.out.println("Error: 101");
    }
    }
}
