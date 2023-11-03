package com.sv.in.designspattern.builder;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone=new PhoneBuilder().setOs("Android").setRam(4).setBattery(5000).getPhone();
        System.out.println(phone);
    }
}
