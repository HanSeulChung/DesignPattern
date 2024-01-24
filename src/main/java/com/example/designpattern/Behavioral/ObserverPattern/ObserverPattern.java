package com.example.designpattern.Behavioral.ObserverPattern;

public class ObserverPattern {
  public static void main(String[] args) {
    Dog dog = new Dog();

    Owner owner1 = new Owner("주인1");
    Owner owner2 = new Owner("주인2");

    // 옵저버 등록
    dog.registerObserver(owner1);
    dog.registerObserver(owner2);

    // 상태 변화
    dog.eat();
    dog.drink();
    dog.poop();
  }
}
