package com.example.designpattern.Behavioral.JavaObserverPattern.Deprecated;

import java.util.Observable;

public class Dog extends Observable {

  private String action;
  public void eat() {
    action = "밥을 다 먹었다.";
    this.setChanged();
    this.notifyObservers(action);
  }

  public void drink() {
    action = "물을 다 마셨다.";
    this.setChanged();
    this.notifyObservers(action);
  }

  public void poop() {
    action = "똥을 쌌다.";
    this.setChanged();
    this.notifyObservers(action);
  }
}
