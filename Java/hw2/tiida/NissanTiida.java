package fcu.iecs.oop.tiida;

public class NissanTiida {
  private int num = 1;

  /**.
   * NissanTiida
   */
  public void tiida() {
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
        System.out.print("*");
      }
      System.out.print('\n');
    }
    num++;
  }
}
