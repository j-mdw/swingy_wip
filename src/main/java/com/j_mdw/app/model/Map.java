package com.j_mdw.app.model;

import java.util.ArrayList;
import java.util.List;

public class Map {
  private final int COLLISION_ERROR = 3;

  private int size;
  private List<Position> vilains;

  public void generate(int heroLevel) throws Exception {
    setSize(heroLevel);
    setVilains(size);
  }

  public int getSize() {
    return size;
  }

  private void setSize(int heroLevel) throws Exception {
    if (heroLevel <= 0) {
      throw new Exception("Level must be positive");
   }
   size = (heroLevel - 1) * 5 + 9;
  }

  private void setVilains(int mapSize) throws Exception {
    int numberOfVilains = mapSize / 3;
    vilains = new ArrayList<>();
    for (int i = 0; i < numberOfVilains; i++) {
      addVilain();
    }
  }

  public boolean isVilain(Position position) {
    for (Position vilain : vilains) {
      if (vilain.equal(position)) {
        return true;
      }
    }
    return false;
  }

  public Position getMiddle() throws Exception {
    return new Position(size / 2, size / 2);
  }

  private void addVilain() throws Exception {
    for (int i = 0; i < COLLISION_ERROR + 1; i++) {
      
      if (i == COLLISION_ERROR) {
        throw new Exception("Collision error in the creation of vilain on map");
      }

      Position vilain = generatePosition();
      if (isAvailable(vilain)) {
        vilains.add(vilain);
        break;
      }
    }
  }

  private Position generatePosition() throws Exception {
    int x = Utils.randomUint(size);
    int y = Utils.randomUint(size);
    return new Position(x, y);
  }

  private boolean isAvailable(Position position) throws Exception {
    Position heroPosition = new Position(size / 2, size / 2);
    if (heroPosition.equal(position)) {
      return false;
    }
    for (Position vilain : vilains) {
      if (vilain.equal(position)) {
        return false;
      }
    }
    return true;
  }
}
