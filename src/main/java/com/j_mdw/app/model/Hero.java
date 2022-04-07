package com.j_mdw.app.model;

public class Hero {
  private String name;
  private String type;
  private int level;
  private int xp;
  private HeroStats stats;

  public Hero(HeroStats stats) {
    this.stats = stats;
  }
}