package com.example.designpattern.Behavioral.JavaObserverPattern;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Dog {
  PropertyChangeSupport support = new PropertyChangeSupport(this);

  private String action;

  public void addObserver(PropertyChangeListener observer) {
    if (observer != null) {
      this.support.addPropertyChangeListener(observer);
    }
  }

  public void removeObserver(PropertyChangeListener observer) {
    if (observer != null) {
      this.support.removePropertyChangeListener(observer);
    }
  }

  public void notifyObservers(String newValue) {
    support.firePropertyChange("event name", null, newValue);
  }

  public void eat() {
    action = "밥을 다 먹었다.";
    this.notifyObservers(action);
  }

  public void drink() {
    action = "물을 다 마셨다.";
    this.notifyObservers(action);
  }

  public void poop() {
    action = "똥을 쌌다.";
    this.notifyObservers(action);
  }
}
