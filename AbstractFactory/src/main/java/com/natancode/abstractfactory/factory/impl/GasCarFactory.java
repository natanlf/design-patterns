package com.natancode.abstractfactory.factory.impl;

import com.natancode.abstractfactory.factory.CarFactory;
import com.natancode.abstractfactory.product.Sedan;
import com.natancode.abstractfactory.product.Suv;
import com.natancode.abstractfactory.product.impl.GasSedan;
import com.natancode.abstractfactory.product.impl.GasSuv;

public class GasCarFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new GasSedan();
    }

    @Override
    public Suv createSuv() {
        return new GasSuv();
    }
}
