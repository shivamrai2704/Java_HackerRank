import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner obj=new Scanner(System.in);
        String[][] data = {
            {"Java", "4", "Shruti"},
            {"OS", "3", "Puneet Kumar"},
            {"AI", "2", "James William Android"},
            {"Android", "3", "Md. Adil Khan"},
        };
        int c=0;
        String a=obj.next();
        for(int i=0;i<=3;i++)
        { 
            if(a.equals(data[i][0]))
            {
                System.out.println(data[i][2]+" "+data[i][1]);
            }
            else{
                c=c+1;
            }
        }
        
        if(c==4)
        {
            System.out.println("This subject is not running in this semester.");
        }

    }
}
