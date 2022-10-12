package by.itacademy.hw19.task1.model.line.step;

import by.itacademy.hw19.task1.model.product.part.IProductPart;
import by.itacademy.hw19.task1.model.product.part.LaptopCase;

public class LaptopCaseLineStep implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        return new LaptopCase();
    }
}
