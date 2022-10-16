package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.exception.ServiceNotExistException;
import by.itacademy.hw20.task1.model.hotel.Service;
import by.itacademy.hw20.task1.repository.ServiceRepository;

import java.math.BigDecimal;
import java.util.List;

public class ServicesService {

    private final ServiceRepository repository = ServiceRepository.getInstance();


    public List<Service> getServices(){
        return repository.getServices();
    }

    public Service getService(long idService){
        List<Service> serviceList = repository.getServices().stream()
                .filter(service -> service.getId() == idService)
                .limit(1)
                .toList();

        if (serviceList.isEmpty()) {
            throw new ServiceNotExistException("ERROR! The service not found!");
        }

        return serviceList.get(0);
    }

    public Service addService(String name){

        Service service = new Service(name);
        repository.getServices().add(service);

        return service;
    }

    public void setPriceOfService(Service service, BigDecimal price) {

        service.setPrice(price);

    }

}
