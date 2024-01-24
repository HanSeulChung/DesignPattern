package com.example.designpattern.Behavioral.ObserverPattern;

public class Owner implements Observer {
  private String name;

  public Owner(String name) {
    this.name = name;
  }

  @Override
  public void update(String action) {
    System.out.println(name + "이(가) 강아지의 상태 변화를 감지했습니다. 행동: " + action);
  }
}
