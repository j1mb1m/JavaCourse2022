package by.itacademy.hw19.task1.model.line.step;

import by.itacademy.hw19.task1.model.product.part.IProductPart;
import by.itacademy.hw19.task1.model.product.part.Monitor;

public class MonitorLineStep implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        return new Monitor();
    }
}
