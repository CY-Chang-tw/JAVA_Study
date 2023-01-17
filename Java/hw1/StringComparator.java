package fcu.oop;

import java.util.Scanner;

public class StringComparator {
  /**.
   * StringComparator
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the string 1: ");
    String s1 = scanner.next();

    System.out.print("Enter the string 2: ");
    String s2 = scanner.next();


    if (s1.toLowerCase().equals(s2.toLowerCase())) {
      System.out.print("The two strings are the same.");
    } else {
      System.out.print("The two strings are not the same.");
    }
    scanner.close();
  }
}
