package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();

        cars.add(new Car(1L, "BMW X5", 2005));
        cars.add(new Car(2L, "Mercedes S222", 2019));
        cars.add(new Car(3L, "Toyota Camry", 2013));
        cars.add(new Car(4L, "Lexus IS250", 2006));
        cars.add(new Car(5L, "Ford Mustang", 1967));
    }

    public List<Car> getCars(int numOfCars) {
        return cars
                .stream()
                .limit(numOfCars)
                .collect(Collectors.toList());
    }

}
