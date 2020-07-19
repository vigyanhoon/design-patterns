package com.builder;

public class PhoneBuilder {
  private Phone phone = new Phone();

  public PhoneBuilder setOS(String os) {
    phone.setOs(os);
    return this;
  }

  public PhoneBuilder setMemory(int memory) {
    phone.setMemory(memory);
    return this;
  }

  public Phone getPhone() {
    return phone;
  }

  public static void main(String args[]) {
    PhoneBuilder phoneBuilder = new PhoneBuilder();
    phoneBuilder.setMemory(1000)
            .setOS("Android");
    System.out.println(phoneBuilder.getPhone().getMemory());
  }
}
