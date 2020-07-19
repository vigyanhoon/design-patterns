package com.abstractfactory;

public class NokiaMobile implements Device {
  @Override
  public void getDetails() {
    System.out.println("this is Nokia Mobile");
  }
}
