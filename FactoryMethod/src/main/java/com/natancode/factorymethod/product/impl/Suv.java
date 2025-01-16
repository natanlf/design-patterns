package com.natancode.factorymethod.product.impl;

import com.natancode.factorymethod.product.Car;

public class Suv implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling an SUV");
    }

}
