package com.example.designpattern.Behavioral.ObserverPattern;

public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers(String action);
}
