package fcu.oop;

public class Pokemon {
  /**.
   * Pokemon class definition
   */

  private String name;
  private PokemonType type;
  private int cp;


  public String getName() {
    return name;
  }

  public PokemonType getType() {
    return type;
  }

  public void setCp(int cp) {
    this.cp = cp;
  }

  public int getCp() {
    return cp;
  }

  /**.
   * POKEMON construct
   */

  public Pokemon(String name,PokemonType type,int cp) {
    this.name = name;
    this.type = type;
    this.cp = cp;
  }
}
