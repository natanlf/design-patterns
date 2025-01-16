package com.natancode.abstractfactory.product.impl;

import com.natancode.abstractfactory.product.Sedan;

public class EletricSedan implements Sedan {
    @Override
    public void assembleSedan() {
        System.out.println("Assembling an Electric Sedan");
    }
}
