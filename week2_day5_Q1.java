import java.io.*;
import java.util.*;



public class Solution {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);



    float num1 = scan.nextFloat();

    int int1 = (int) num1;

    if (num1 > int1) {

      int1++;

    }


    float num2 = scan.nextFloat();

    int int2 = (int) num2;

    if (num2 > int2) {

      int2++;

    }


    float num3 = scan.nextFloat();

    int int3 = (int) num3;

    if (num3 > int3) {

      int3++;

    }

    System.out.println( int1 + " "+ int2 + " " + int3);

  }

}
