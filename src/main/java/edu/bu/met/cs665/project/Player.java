package edu.bu.met.cs665.project;

import edu.bu.met.cs665.project.sport.*;

/**
 * This Class represents a Player.
 * 
 * @author Kia
 *
 */
public class Player {
  private String firstName;
  private String lastName;
  private String dob;
  private Sport sport;

  /**
   * Create a Player object using first and last name and birthday.
   * 
   * @param firstName firstname of the person as string
   * @param lastName lastname of the person as string
   */
  public Player(String firstName, String lastName, String dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
  }

  /**
   * Getter method for first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter method for first name string.
   * 
   * @param firstName first name of a person
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter method for last name of the person.
   * 
   * @return
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter method for the last name of the person.
   * 
   * @param lastName last name string
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Getter method for the age of the player
   * @return
   */
  public String getDob() { return dob; }

  /**
   * Setter method for the age of the player
   * @param dob
   */
  public void setDob(String dob) { this.dob = dob; }

  /**
   * Getter for sport
    * @return
   */
  public Sport getSport() { return sport; }

  /**
   * Setter for sport
   * @param sport
   */
  public void setSport(String sport) {
    switch (sport) {
      case "Baseball":
        this.sport = new Baseball();
        break;
      case "Basketball":
        this.sport = new Basketball();
      break;
      case "Football":
        this.sport = new Football();
      break;
      case "Hockey":
        this.sport = new Hockey();
      break;
      default:
        System.out.println("WE dont have that sport yet");
    }
  }

  @Override
  public String toString() {
    return firstName + ' ' + lastName + " was born " + dob;
  }

  public String getOffensiveStats(){
    return "Getting offensive stats";
  }

  public String getDefensiveStats(){
    return "Getting defensive stats";
  }

  public String getCombinedStats(){

    return getOffensiveStats() + " and " + getDefensiveStats();

  }

}
