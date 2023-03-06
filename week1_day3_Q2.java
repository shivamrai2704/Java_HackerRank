import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        int cube,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for (int i = 0; i <= n; i++)
        {
            cube = i * i * i;
            if (cube == n)
            {
                System.out.println("Perfect Cube");
                return;
            }
            else if (cube > n)
            {
                System.out.println("Not Perfect Cube");
                return;
            }
        }
    }
}
