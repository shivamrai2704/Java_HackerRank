import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        int choice = sc.nextInt();
        
        if(choice == 1)
        {
            double amt = sc.nextDouble();
            double d = balance-amt;
            System.out.printf("%.2f",d);
        }
        else if(choice == 2)
        {
            double amt = sc.nextDouble();
            double d = balance+amt;
            System.out.printf("%.2f",d);
        }
        else
            System.out.println("Error");
    }
}
