package com.abstractfactory;

public class HPLaptop implements Device {
  @Override
  public void getDetails() {
    System.out.println("this is HP Laptop");
  }
}
