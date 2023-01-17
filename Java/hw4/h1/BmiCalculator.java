package fcu.oop.h1;

import org.w3c.dom.ls.LSOutput;

public class BmiCalculator {
  /**
   * BmiCalculator.
   */
  private static String result;

  private static double wei;
  private static double hei;

  public static double getBmi(double weight, double height) {
    return weight / (height * height);
  }

  /**
   * Bmi.
   */
  public static String getBmi(String weight, String height) {
    wei = Double.parseDouble(weight);
    hei = Double.parseDouble(height);
    result = Double.toString(getBmi(wei, hei));
    return result;
  }
}
