package com.example.designpattern.Behavioral.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Dog implements Subject {
  private List<Observer> observers = new ArrayList<>();
  private String action;

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers(String action) {
    for (Observer observer : observers) {
      observer.update(action);
    }
  }

  public void eat() {
    action = "밥을 다 먹었다.";
    notifyObservers(action);
  }

  public void drink() {
    action = "물을 다 마셨다.";
    notifyObservers(action);
  }

  public void poop() {
    action = "똥을 쌌다.";
    notifyObservers(action);
  }
}
