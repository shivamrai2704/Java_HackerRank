import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc = new Scanner(System.in);

    int classesHeld = sc.nextInt();
    int classesAttended = sc.nextInt();

    int attendancePercentage = (classesAttended * 100) / classesHeld;
    
    if (attendancePercentage >= 75) 
    {
     	System.out.println(attendancePercentage + "\nYes");
    } 
    else 
    {
      System.out.println(attendancePercentage + "\nNo");
    }
        
    }
}
