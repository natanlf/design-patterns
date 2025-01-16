package com.natancode.abstractfactory.product.impl;

import com.natancode.abstractfactory.product.Sedan;

public class GasSedan implements Sedan {
    @Override
    public void assembleSedan() {
        System.out.println("Assembling a Gas Sedan");
    }
}
