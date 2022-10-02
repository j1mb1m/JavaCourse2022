package by.itacademy.hw19.task1.model.product;

import by.itacademy.hw19.task1.model.product.part.IProductPart;

public interface IProduct {

    void installFirstPart(IProductPart productPart);

    void installSecondPart(IProductPart productPart);

    void installThirdPart(IProductPart productPart);

}
