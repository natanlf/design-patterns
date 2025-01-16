package com.natancode.abstractfactory.factory.impl;

import com.natancode.abstractfactory.factory.CarFactory;
import com.natancode.abstractfactory.product.Sedan;
import com.natancode.abstractfactory.product.Suv;
import com.natancode.abstractfactory.product.impl.ElectricSUV;
import com.natancode.abstractfactory.product.impl.EletricSedan;

public class EletricCarFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new EletricSedan();
    }

    @Override
    public Suv createSuv() {
        return new ElectricSUV();
    }
}
