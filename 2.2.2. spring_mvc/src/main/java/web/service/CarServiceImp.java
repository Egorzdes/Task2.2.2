package web.service;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.Arrays;

@Component
class CarServiceImp implements ServiseCar {


    private ArrayList<Cars> carModels =
            new ArrayList<>(Arrays.asList(
                    new Cars("bmv", 100, "black"),
                    new Cars("mercedes", 200, "black"),
                    new Cars("mazda", 300, "black"),
                    new Cars("volvo", 60, "black"),
                    new Cars("renault", 500, "black"))
            );

    @Override
    public ArrayList<Cars> printCars() {
        return carModels;
    }
}
