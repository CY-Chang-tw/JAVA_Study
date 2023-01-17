package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
  /**.
   * Main class
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PasswordEncoder user = new PasswordEncoder();

    for (;;) {
      String pass = scanner.nextLine();
      if (pass.equals("exit")) {
        break;
      }
      System.out.print(user.encode(pass));
    }
  }
}
