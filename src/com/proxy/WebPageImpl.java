package com.proxy;

public class WebPageImpl implements IWebPage{
  @Override
  public void load(String url) {
    System.out.println(url + " loaded successfully");
  }
}
