package kg.easy.springbdconnection.services.impl;

import kg.easy.springbdconnection.models.entity.Car;
import kg.easy.springbdconnection.repository.CarRepo;
import kg.easy.springbdconnection.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarRepo carRepo;

    public CarServiceImpl (CarRepo carRepo){
        this.carRepo = carRepo;
    }
    @Override
    public Car saveCar(Car car) {
        car = carRepo.save(car);
        return car;
    }

    @Override
    public List<Car> getAll() {
        return carRepo.findAll();
    }

    @Override
    public List<Car> getAllByRunAndDrive(boolean runAndDrive) {
        return carRepo.findAllByActiveIs(runAndDrive);
    }
}
