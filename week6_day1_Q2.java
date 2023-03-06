import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=0){
            System.out.println("Invalid");
        }
        else{
        String arr[] = new String[a];
        int alpha = 0, digi = 0;
        for(int i=0;i<a;i++){
            arr[i] = sc.next();
            if(arr[i].charAt(0)>= '0' && arr[i].charAt(0) <= '9') digi++;
            else alpha++;
        }
        
        System.out.println(digi +" \n"+alpha);
        }
        
        
    }
}





import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid");
            return;
        }

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int num_count = 0;
        int alpha_count = 0;

        for (String s : arr) {
            if (s.matches("\\d+")) {
                num_count++;
            } else if (s.matches("[a-zA-Z]+")) {
                alpha_count++;
            }
        }

        System.out.println(num_count);
        System.out.println(alpha_count);
    }
}
