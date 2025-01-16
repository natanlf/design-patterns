package com.natancode.factorymethod.factory.impl;

import com.natancode.factorymethod.factory.CarFactory;
import com.natancode.factorymethod.product.Car;
import com.natancode.factorymethod.product.impl.Sedan;

public class SedanFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }

}
