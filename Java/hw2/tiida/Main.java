package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
  /**.
   * Main class
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    NissanTiida tii = new NissanTiida();

    System.out.print("Please enter a number: ");
    int time = scanner.nextInt();
    int count = 1;
    while (count <= time) {
      tii.tiida();
      count++;
    }
  }
}
