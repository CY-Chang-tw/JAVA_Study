package fcu.oop;

public class Player {
  /**.
   * Player class definition
   */

  private String playName;
  private Pokemon[] pokemons;
  private int level = 1;

  public void setPlayName(String playName) {
    this.playName = playName;
  }

  public String getPlayName() {
    return playName;
  }

  public void setPokemons(Pokemon[] pokemons) {
    this.pokemons = pokemons;
  }

  public Pokemon[] getPokemons() {
    return pokemons;
  }

  public void setLevel() {
    this.level++;
  }

  public int getLevel() {
    return level;
  }

  public Player(String playName) {
    this.playName = playName;
  }
}
