package com.abstractfactory;

public class SamsungMobile implements Device {
  @Override
  public void getDetails() {
    System.out.println("this is Samsung mobile");
  }
}
