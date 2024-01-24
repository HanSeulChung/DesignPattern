package com.example.designpattern.Behavioral.JavaObserverPattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Owner implements PropertyChangeListener {

  private String name;

  public Owner(String name) {
    this.name = name;
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    System.out.println(name + "이(가) 강아지의 상태 변화를 감지했습니다. 행동: " + evt.getNewValue());
  }
}
