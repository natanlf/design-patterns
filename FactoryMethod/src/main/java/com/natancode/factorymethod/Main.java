package com.natancode.factorymethod;

import com.natancode.factorymethod.factory.CarFactory;
import com.natancode.factorymethod.factory.impl.SedanFactory;
import com.natancode.factorymethod.factory.impl.SuvFactory;
import com.natancode.factorymethod.product.Car;

public class Main {
    public static void main(String[] args) {

        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        sedan.assemble();

        CarFactory suvFactory = new SuvFactory();
        Car suvCar = suvFactory.createCar();
        suvCar.assemble();

    }
}