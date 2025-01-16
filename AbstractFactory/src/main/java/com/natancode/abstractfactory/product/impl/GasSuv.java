package com.natancode.abstractfactory.product.impl;

import com.natancode.abstractfactory.product.Suv;

public class GasSuv implements Suv {
    @Override
    public void assembleSuv() {
        System.out.println("Assembling a Gas SUV");
    }
}
