package fcu.oop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KeyboardScanner {
  /**.
   * Keyboard Scanner
  */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    double in = scanner.nextDouble();
    System.out.print("Enter a float point number: ");
    double fl = scanner.nextFloat();
    DecimalFormat df = new DecimalFormat("0.######");
    System.out.print("Enter your name: ");
    String str = scanner.next();
    double dou = in * fl;
    System.out.printf("Hi %s, the multiplication of %.0f ", str, in);
    System.out.printf("and %s is %.2e.", df.format(fl), dou);
    scanner.close();
  }
}
