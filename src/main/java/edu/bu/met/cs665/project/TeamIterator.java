package edu.bu.met.cs665.project;

public class TeamIterator implements Iterator {
  Player[] team;
  int position = 0;

  public TeamIterator(Player[] team){
    this.team = team;
  }

  @Override
  public Player next() {
    Player player = team[position];
    position++;
    return player;
  }

  @Override
  public boolean hasNext() {
    if (position >= team.length || team[position] == null) {
      return false;
    }
    return true;
  }

}
