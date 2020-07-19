package com.factory;

public class OSFactory {
  public static OS getOS(OSTypes type) {
    return switch (type) {
      case ANDROID -> new AndroidOS();
      case IOS -> new IOS();
    };
  }
}
