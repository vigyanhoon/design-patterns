package com.singleton;

public class Sanjay {
  static Sanjay sanjay;
  final private String name = "Sanjay";

  private Sanjay() {
//    there can be only one sanjay
  }

  public String getName() {
    return name;
  }

  public static Sanjay getInstance() {
    if (sanjay == null) {
      sanjay = new Sanjay();
    }

    return sanjay;
  }
}
