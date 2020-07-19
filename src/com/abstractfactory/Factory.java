package com.abstractfactory;

public interface Factory {
  Device getDevice(DeviceType type);
}
