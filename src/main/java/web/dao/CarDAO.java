package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    public static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "aaa", "sedan"));
        cars.add(new Car(++CAR_COUNT, "bbb", "wagon"));
        cars.add(new Car(++CAR_COUNT, "ccc", "roadster"));
        cars.add(new Car(++CAR_COUNT, "ddd", "coupe"));
        cars.add(new Car(++CAR_COUNT, "eee", "micro"));
    }

    public List<Car> show(int count) {
        return cars.stream().limit(count).toList();
    }
}
