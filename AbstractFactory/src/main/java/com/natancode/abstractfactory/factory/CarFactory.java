package com.natancode.abstractfactory.factory;

import com.natancode.abstractfactory.product.Sedan;
import com.natancode.abstractfactory.product.Suv;

public interface CarFactory {
    Sedan createSedan();
    Suv createSuv();
}
