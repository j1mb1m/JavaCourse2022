package by.itacademy.hw19.task1.model.product;

import by.itacademy.hw19.task1.model.product.part.IProductPart;

public class Laptop implements IProduct{

    IProductPart laptopCase;
    IProductPart motherboard;
    IProductPart monitor;

    @Override
    public void installFirstPart(IProductPart productPart) {
        laptopCase = productPart;
    }

    @Override
    public void installSecondPart(IProductPart productPart) {
        motherboard = productPart;
    }

    @Override
    public void installThirdPart(IProductPart productPart) {
        monitor = productPart;
    }

    @Override
    public String toString() {
        return String.format("Laptop (%s, %s, %s)", laptopCase, motherboard, monitor);
    }
}
