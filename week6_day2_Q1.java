import java.io.*;
import java.util.*;

class Integer1 {
    private int[] arr;

    Integer1(int[] arr) {
        this.arr = arr;
    }

    int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    int multiplication() {
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }
        return mul;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        
        int size = sc.nextInt();

        if (size < 0) {
            System.out.println("Invalid Array Size");
            return;
        }

        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        
        int choice = sc.nextInt();

        Integer1 integer1 = new Integer1(arr);

        switch (choice) {
            case 1:
                System.out.println(integer1.sum());
                break;
            case 2:
                System.out.println(integer1.multiplication());
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
