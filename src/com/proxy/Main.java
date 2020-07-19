package com.proxy;

public class Main {
  public static void main(String args[]) {
    WebPageProxy wpp = new WebPageProxy();

    try {
      wpp.load("medium.com");
      wpp.load("youtube.com");
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
