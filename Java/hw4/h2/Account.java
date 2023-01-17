package fcu.oop.h2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Account {
  /**
   * Account Class.
   */
  private String name;
  private String account;
  private String password;
  private double balance;
  static final double INTEREST_RATE = 0.0155;


  public Account() {

  }

  public Account(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAccount() {
    return account;
  }

  /**
   * setAccount method.
   */

  public void setAccount(String account) {
    if (account.matches("^[a-z0-9._]+@[a-z1-9]+(([.]{1}[a-z]+)+)$")) {
      this.account = account;
    } else {
      this.account = null;
    }
  }

  public String getPassword() {
    return password;
  }

  /**
   * setPassword method.
   */

  public void setPassword(String password) {
    String regex1 = "^.*[a-z]+.*$";
    String regex2 = "^.*[A-Z]+.*$";
    String regex3 = "^.*[0-9]+.*$";
    String regex4 = "^.*[^\\w]+.*$";
    Boolean hasUppercaseNumber =
        password.matches(regex1) && password.matches(regex2)
          && password.matches(regex3) && !password.matches(regex4);

    if (hasUppercaseNumber) {
      this.password = password;
    } else {
      this.password = null;
    }
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getInterest() {
    return this.balance * INTEREST_RATE;
  }

  public double deposite(int depositMoney) {    // deposite is not a correct word
    return this.balance += (double)depositMoney;  // deposit is the correct one
  }
  // I still have to type in "deposite",
  // because of the Prog Edu would give me a dxxn COMPILE FAILURE.
  // BTW, Prog Edu is not that good.
  // It doesn't precisely indicate what going on with my code
  // always gave an useless response and left a poor me.

  public double withdraw(int withdrawMoney) {
    return  this.balance -= (double)withdrawMoney;
  }
}
