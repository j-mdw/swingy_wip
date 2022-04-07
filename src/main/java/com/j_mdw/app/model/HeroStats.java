package com.j_mdw.app.model;


public class HeroStats {
  private int attack;
  private int defense;
  private int hitPoints;

  public HeroStats(int attack, int defence, int hitPoints) {
    this.attack = attack;
    this.defense = defence;
    this.hitPoints = hitPoints;
  }

  public int getAttack() {
    return attack;
  }
  public void setAttack(int val) throws Exception {
    if (val < 0) {
      throw new Exception("Invalid attack value: " + val);
    }
    attack = val;
  }

  public int getDefense() {
    return defense;
  }
  public void setDefense(int val) throws Exception {
    if (val < 0) {
      throw new Exception("Invalid defense value: " + val);
    }
    defense = val;
  }

  public int getHitPoints() {
    return hitPoints;
  }
  public void setHitPoints(int val) throws Exception {
    if (val < 0) {
      throw new Exception("Invalid hit points value: " + val);
    }
    hitPoints = val;
  }
}
