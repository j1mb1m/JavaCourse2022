package by.itacademy.hw20.task1.repository;

import by.itacademy.hw20.task1.model.hotel.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository {

    private final List<Service> services = new ArrayList<>();
    private static ServiceRepository instance;

    public static ServiceRepository getInstance() {
        if (instance == null) {
            instance = new ServiceRepository();
        }
        return instance;
    }

    private ServiceRepository() {
        init();
    }

    private void init() {
        services.add(new Service("Laundry", new BigDecimal(5)));
        services.add(new Service("Car rental", new BigDecimal(30)));
        services.add(new Service("Massage", new BigDecimal(15)));
    }

    public List<Service> getServices() {
        return services;
    }

}
