package fcu.oop;

import java.util.Random;

public class Gym {
  /**.
   * Gym class definition
   */

  public static Player fight(Player... players) {
    int play1 = 0;
    int play2 = 0;
    Random ran = new Random();
    for (int i = 0; i < 3; i++) {
      if (players[0].getPokemons()[i].getType().equals(PokemonType.FIRE)) {
        if (players[1].getPokemons()[i].getType().equals(PokemonType.FIRE)) {
          if (players[0].getPokemons()[i].getCp()
              > players[1].getPokemons()[i].getCp()) {
            play1++;
          } else if (players[0].getPokemons()[i].getCp()
              < players[1].getPokemons()[i].getCp()) {
            play2++;
          } else {
            play1 += ran.nextInt(2);
          }
        } else if (players[1].getPokemons()[i].getType().equals(PokemonType.WATER)) {
          play2++;
        } else {
          play1++;
        }
      } else if (players[0].getPokemons()[i].getType().equals(PokemonType.WATER)) {
        if (players[1].getPokemons()[i].getType().equals(PokemonType.WATER)) {
          if (players[0].getPokemons()[i].getCp()
              > players[1].getPokemons()[i].getCp()) {
            play1++;
          } else if (players[0].getPokemons()[i].getCp()
              < players[1].getPokemons()[i].getCp()) {
            play2++;
          } else {
            play1 += ran.nextInt(2);
          }
        } else if (players[1].getPokemons()[i].getType().equals(PokemonType.GRASS)) {
          play2++;
        } else {
          play1++;
        }
      } else {
        if (players[1].getPokemons()[i].getType().equals(PokemonType.GRASS)) {
          if (players[0].getPokemons()[i].getCp()
              > players[1].getPokemons()[i].getCp()) {
            play1++;
          } else if (players[0].getPokemons()[i].getCp()
              < players[1].getPokemons()[i].getCp()) {
            play2++;
          } else {
            play1 += ran.nextInt(2);
          }
        } else if (players[1].getPokemons()[i].getType().equals(PokemonType.FIRE)) {
          play2++;
        } else {
          play1++;
        }
      }
    }
    if (play1 > 1) {
      players[0].setLevel();
      System.out.printf("Winner is %s, and his/her level becomes %d.",
          players[0].getPlayName(),players[0].getLevel());
      return players[0];
    } else {
      players[1].setLevel();
      System.out.printf("Winner is %s, and his/her level becomes %d.",
          players[1].getPlayName(),players[1].getLevel());
      return players[1];
    }
  }
}
