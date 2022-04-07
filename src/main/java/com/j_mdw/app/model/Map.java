package com.j_mdw.app.model;

public class Map {
  private int size;

  public void generateMap(int heroLevel) throws Exception {
    if (heroLevel <= 0) {
      throw new Exception("Level must be positive");
   }
   size = (heroLevel - 1) * 5 + 9;
  }

  public int getSize() {
    return size;
  }
}
