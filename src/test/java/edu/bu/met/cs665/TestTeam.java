package edu.bu.met.cs665;

import edu.bu.met.cs665.project.Iterator;
import edu.bu.met.cs665.project.Player;
import edu.bu.met.cs665.project.Team;
import edu.bu.met.cs665.project.TeamIterator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTeam {
  Team team;

  public TestTeam() {}

  @Test
  public void TestItInstantiates(){
    Team team = new Team("Red Sox");
    assertEquals("Red Sox", team.getName());
  }

  @Test
  public void createTeam() {
    Team team = new Team("Red Sox");
    Player joey = new Player("Joey","Parshley","4/9/1967");
    Player andrea = new Player("Andrea","Parshley","8/16/1998");
    Player maddie = new Player("Maddie","Parshley","10/28/1998");
    Player joseph = new Player("Joseph","Parshley","06/20/2001");
    joey.setSport("Baseball");
    andrea.setSport("Football");
    maddie.setSport("Hockey");
    joseph.setSport("Basketball");
    team.addPlayer(joey);
    team.addPlayer(andrea);
    team.addPlayer(maddie);
    team.addPlayer(joseph);

    Iterator iterator = team.createIterator();

    assertEquals(" Getting offensive stats and Getting defensive stats", team.getPlayersStats());

  }

}
