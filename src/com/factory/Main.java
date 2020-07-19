package com.factory;

public class Main {
  public static void main(String args[]) {
    OS os = OSFactory.getOS(OSTypes.ANDROID);
    os.getName();
  }
}
