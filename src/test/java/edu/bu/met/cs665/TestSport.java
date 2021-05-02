package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;
import edu.bu.met.cs665.project.sport.Baseball;
import edu.bu.met.cs665.project.sport.Basketball;
import edu.bu.met.cs665.project.sport.Football;
import edu.bu.met.cs665.project.sport.Hockey;
import edu.bu.met.cs665.project.sport.Sport;
import org.junit.Test;

public class TestSport {
  public TestSport() {}

  @Test
  public void TestBaseball() {
    Sport baseball = new Baseball();
    assertEquals( "Baseball", baseball.getSportType().toString());
    assertEquals( "sportType: Baseball", baseball.toString());
  }

  @Test
  public void TestFootball() {
    Sport football = new Football();
    assertEquals( "Football", football.getSportType().toString());
    assertEquals( "sportType: Football", football.toString());
  }

  @Test
  public void TestHockey() {
    Sport hockey = new Hockey();
    assertEquals( "Hockey", hockey.getSportType().toString());
    assertEquals( "sportType: Hockey", hockey.toString());
  }

  @Test
  public void TestBasketball() {
    Sport basketball = new Basketball();
    assertEquals( "Basketball", basketball.getSportType().toString());
    assertEquals( "sportType: Basketball", basketball.toString());
  }
}
