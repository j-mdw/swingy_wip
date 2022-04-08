package com.j_mdw.app.model;

public class Game {
  private Hero hero;
  private final Map map;

  public Game(Hero hero) {
    this.hero = hero;
    map = new Map();
  }

  public start() {
    map.generate(hero.getLevel());
  }
}
