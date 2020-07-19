package com.abstractfactory;

public class LaptopFactory implements Factory {
  public Device getDevice(DeviceType type) {
    return switch (type) {
      case HP -> new HPLaptop();
      case Dell -> new DellLaptop();
      default -> null;
    };
  }
}
