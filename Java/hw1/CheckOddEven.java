package fcu.oop;

import java.math.BigDecimal;
import java.util.Scanner;


public class CheckOddEven {
  /**.
   * CheckOddEven
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int inp = scanner.nextInt();

    if (inp % 2 == 0) {
      System.out.print("The input integer is even number.");
    } else {
      System.out.print("The input integer is odd number.");
    }
    scanner.close();
  }
}
