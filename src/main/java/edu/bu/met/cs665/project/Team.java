package edu.bu.met.cs665.project;

public class Team implements TeamInterface{
  public String name;
  static final int MAX_PLAYERS = 15;
  Player[] players = new Player[MAX_PLAYERS];

  public Team(String name){
    this.name = name;
  }

  public Iterator createIterator(){
    return new TeamIterator(this.players);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Player[] getPlayers() {
    return players;
  }

  public String getPlayersStats(){
    Iterator teamIterator = new TeamIterator(this.players);
    return getPlayersStats(teamIterator);
  }

  private String getPlayersStats(Iterator iterator){
    String output = "";
    while (iterator.hasNext()){
      Player player = (Player) iterator.next();
      output = output + " " + player.getCombinedStats();
    }
    return output;
  }

  public void setPlayers(Player[] players) {
    this.players = players;
  }

  @Override
  public void addPlayer(Player player) {
    int numberOfPlayers = 0;
    if (numberOfPlayers >= MAX_PLAYERS) {
      System.out.println("Team is full! Cannot add player");
    } else {
      this.players[numberOfPlayers] = player;
      numberOfPlayers++;
    }
  }
}
