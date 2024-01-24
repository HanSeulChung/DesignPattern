package com.example.designpattern.Behavioral.JavaObserverPattern.Deprecated;

import java.util.Observable;
import java.util.Observer;

public class Owner implements Observer {
  private String name;

  public Owner(String name) {
    this.name = name;
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof Dog) {
      String action = (String) arg;
      System.out.println(name + "이(가) 강아지의 상태 변화를 감지했습니다. 행동: " + action);
    }
  }
}
