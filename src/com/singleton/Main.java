package com.singleton;

public class Main {
  public static void main(String args[]) {
    Sanjay sanjay = Sanjay.getInstance();
    System.out.println(sanjay.getName());
  }
}
