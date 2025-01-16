package com.natancode.factorymethod.factory.impl;

import com.natancode.factorymethod.factory.CarFactory;
import com.natancode.factorymethod.product.Car;
import com.natancode.factorymethod.product.impl.Suv;

public class SuvFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new Suv();
    }

}
