package by.itacademy.hw19.task1.model.line;

import by.itacademy.hw19.task1.model.product.IProduct;

public interface IAssemblyLine {

    IProduct assembleProduct(IProduct product);
}
