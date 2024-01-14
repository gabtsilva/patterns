package main;

import domain.DwarvenGoldmine;

public class Main {

  public static void main(String[] args) {
    DwarvenGoldmine jjGoldmine = new DwarvenGoldmine();
    jjGoldmine.startNewDay();
    jjGoldmine.digOutGold();
    jjGoldmine.endDay();
  }
}
