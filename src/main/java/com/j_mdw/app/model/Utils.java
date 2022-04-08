package com.j_mdw.app.model;

import java.util.Random;

public class Utils {
  static int randomUint(int upperBound) {
    assert upperBound > 0;
    Random rand = new Random();
    return rand.nextInt(upperBound);
  }
}
