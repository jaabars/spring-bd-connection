package kg.easy.springbdconnection.services;

import kg.easy.springbdconnection.models.entity.Car;

import java.util.List;

public interface CarService {
    Car saveCar(Car car);

    List<Car> getAll();

    List<Car> getAllByRunAndDrive(boolean runAndDrive);
}
