/*
package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import app.dao.CarDAO;

@Controller
@RequestMapping("/cars")
public class CarCantRoller {

    private final CarDAO carDAO;

    @Autowired
    public CarCantRoller(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String cars(@RequestParam(value = "count", defaultValue = "5") String count, ModelMap model) {
        model.addAttribute("cars", carDAO.show(Integer.parseInt(count)));
        return "cars";
    }
}
*/
