package edu.bu.met.cs665.project.sport;

public abstract class Sport {
  protected SportTypeEnum TYPE;
  protected String sportRules;

  public Sport() {}

  public Sport(SportTypeEnum sportType) {
    this.TYPE = sportType;
  }

  public SportTypeEnum getSportType() {
    return TYPE;
  }

  public String getSportRules() {
    return sportRules;
  }

  public void setSportRules(String sportRules) {
    this.sportRules = sportRules;
  }

  @Override
  public String toString() {
    return "sportType: " + TYPE.toString();
  }
}
