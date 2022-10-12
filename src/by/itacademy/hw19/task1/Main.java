package by.itacademy.hw19.task1;

import by.itacademy.hw19.task1.model.line.AssemblyLine;
import by.itacademy.hw19.task1.model.line.step.LaptopCaseLineStep;
import by.itacademy.hw19.task1.model.line.step.MonitorLineStep;
import by.itacademy.hw19.task1.model.line.step.MotherboardLineStep;
import by.itacademy.hw19.task1.model.product.IProduct;
import by.itacademy.hw19.task1.model.product.Laptop;

/**
 * 3) Ноутбуки (корпус, материнская плата, монитор)
 */
public class Main {

    public static void main(String[] args) {

        AssemblyLine line = new AssemblyLine(new LaptopCaseLineStep(), new MotherboardLineStep(), new MonitorLineStep());
        IProduct product = line.assembleProduct(new Laptop());

    }
}
