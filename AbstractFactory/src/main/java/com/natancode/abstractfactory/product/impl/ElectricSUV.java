package com.natancode.abstractfactory.product.impl;

import com.natancode.abstractfactory.product.Suv;

public class ElectricSUV implements Suv {
    @Override
    public void assembleSuv() {
        System.out.println("Assembling an Electric SUV");
    }
}
