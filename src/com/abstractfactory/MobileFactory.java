package com.abstractfactory;

public class MobileFactory implements Factory  {
  public Device getDevice(DeviceType type) {
    return switch (type) {
      case Nokia -> new NokiaMobile();
      case Samsung -> new SamsungMobile();
      default -> null;
    };
  }
}
