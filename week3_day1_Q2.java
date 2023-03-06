import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double borrowedAmount = scan.nextDouble();
    double interestRate = 10.0;
    int loanDuration = 12;

    double totalAmount = borrowedAmount * (1 + interestRate / 100);
    double emi = totalAmount / loanDuration;

    DecimalFormat df = new DecimalFormat("#.00");
    df.setRoundingMode(RoundingMode.DOWN);

    System.out.println((int)totalAmount);
    System.out.println( df.format(emi));
  }
}
