package kg.easy.springbdconnection.controllers;

import kg.easy.springbdconnection.models.entity.Car;
import kg.easy.springbdconnection.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/car")
@AllArgsConstructor
public class CarController {

    private CarService carService;

    @PostMapping("/save")
    public Car saveCar(@RequestBody Car car){
        return carService.saveCar(car);
    }

    @PutMapping("/update")
    public Car updateCar(@RequestBody Car car){
        return carService.saveCar(car);
    }

    @GetMapping("/getAll")
    public List<Car> getCars(){
        return carService.getAll();
    }
    /**
     * вернуть все runAndDrive машины true либо false
     * */
    @GetMapping("/getAllRunAndDrive")
    public List<Car> getAllActiveCars(@RequestParam boolean runAndDrive){
        return carService.getAllByRunAndDrive(runAndDrive);
    }

}
