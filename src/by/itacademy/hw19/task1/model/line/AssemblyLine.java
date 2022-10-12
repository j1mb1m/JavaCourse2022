package by.itacademy.hw19.task1.model.line;

import by.itacademy.hw19.task1.model.line.step.LaptopCaseLineStep;
import by.itacademy.hw19.task1.model.line.step.MonitorLineStep;
import by.itacademy.hw19.task1.model.line.step.MotherboardLineStep;
import by.itacademy.hw19.task1.model.product.IProduct;
import by.itacademy.hw19.task1.model.product.part.LaptopCase;
import by.itacademy.hw19.task1.model.product.part.Monitor;
import by.itacademy.hw19.task1.model.product.part.Motherboard;

public class AssemblyLine implements IAssemblyLine{

    private final LaptopCaseLineStep laptopCaseLineStep;
    private final MotherboardLineStep motherboardLineStep;
    private final MonitorLineStep monitorLineStep;

    public AssemblyLine(LaptopCaseLineStep laptopCaseLineStep, MotherboardLineStep motherboardLineStep, MonitorLineStep monitorLineStep)  {
        this.laptopCaseLineStep = laptopCaseLineStep;
        this.motherboardLineStep = motherboardLineStep;
        this.monitorLineStep = monitorLineStep;
        System.out.println("The assembly line has been created.");
    }

    @Override
    public IProduct assembleProduct(IProduct product) {

        System.out.println("The case building step is in progress..");
        LaptopCase laptopCase = (LaptopCase) laptopCaseLineStep.buildProductPart();
        System.out.println("The case building step is completed..");
        product.installFirstPart(laptopCase);
        System.out.println("The case is installed.");

        System.out.println("The motherboard building step is in progress..");
        Motherboard motherboard = (Motherboard) motherboardLineStep.buildProductPart();
        System.out.println("The motherboard building step is completed..");
        product.installSecondPart(motherboard);
        System.out.println("The motherboard is installed.");

        System.out.println("The monitor building step is in progress..");
        Monitor monitor = (Monitor) monitorLineStep.buildProductPart();
        System.out.println("The monitor building step is completed..");
        product.installThirdPart(monitor);
        System.out.println("The monitor is installed.");

        System.out.println("Created " + product);
        return product;
    }
}
