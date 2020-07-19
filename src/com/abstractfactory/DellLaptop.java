package com.abstractfactory;

public class DellLaptop implements Device {
  @Override
  public void getDetails() {
    System.out.println("This is dell laptop");
  }
}
