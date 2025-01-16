package com.natancode.abstractfactory;

import com.natancode.abstractfactory.factory.CarFactory;
import com.natancode.abstractfactory.factory.impl.EletricCarFactory;
import com.natancode.abstractfactory.factory.impl.GasCarFactory;
import com.natancode.abstractfactory.product.Sedan;
import com.natancode.abstractfactory.product.Suv;

public class Main {
    public static void main(String[] args) {

        CarFactory eletricCarFactory = new EletricCarFactory();

        Sedan eletricSedan = eletricCarFactory.createSedan();
        eletricSedan.assembleSedan();
        Suv eletricSuv = eletricCarFactory.createSuv();
        eletricSuv.assembleSuv();

        CarFactory gasCarFactory = new GasCarFactory();
        Sedan gasSedan = gasCarFactory.createSedan();
        gasSedan.assembleSedan();

        Suv gasSuv = gasCarFactory.createSuv();
        gasSuv.assembleSuv();

    }
}