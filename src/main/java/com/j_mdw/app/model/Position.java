package com.j_mdw.app.model;

public class Position {
  private int x;
  private int y;

  public Position (int x, int y) throws Exception {
    if (x < 0 || y < 0) {
      throw new Exception("Invalid position");
    }
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public boolean equal(Position position) {
    return (position.getX() == x && position.getY() == y);
  }
}
