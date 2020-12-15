package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiseCar;


@Controller
public class CarsController {

    public final ServiseCar serv;

    public CarsController(ServiseCar serv) {
        this.serv = serv;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required = false) Long count, ModelMap model) {

        if (count == null || count > 5L) {
            model.addAttribute("printCars", serv.printCars());
        } else {

            Object[] objects = serv.printCars().stream().limit(count).toArray();
            model.addAttribute("printCars", objects);
        }

        return "cars";
    }
}