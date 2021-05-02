package edu.bu.met.cs665;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.project.Player;

public class TestPlayer {
  Player player;

  public TestPlayer() {}

  @Before
  public void setUp(){
    player = new Player("Joey", "Parshley", "4/9/1967");
  }

  @Test
  public void testGetFirstName() {
    assertEquals("Joey", player.getFirstName());
  }

  @Test
  public void testSetFirstName() {
    player.setFirstName("Bob");

    // age one year after is one
    assertEquals("Bob", player.getFirstName());
  }

  @Test
  public void testGetLastName() {
    assertEquals("Parshley", player.getLastName());
  }

  @Test
  public void testSetLastName() {
    player.setLastName("Henrink");
    assertEquals("Henrink", player.getLastName());
  }

//  @Test
//  public void testPlayer() {
//
//    Player player = new Player("Joey", "Parshley");
//    assertEquals("Joey", player.getFirstName());
//    assertEquals("Parshley", player.getLastName());
//    assertEquals("Joey Parshley plays baseball",
//        player.toString());
//  }
}
