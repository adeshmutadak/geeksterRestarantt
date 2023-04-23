package com.geekster.restaraunt.geeksterRestarant.controller;

import com.geekster.restaraunt.geeksterRestarant.model.RestaurantModel;
import com.geekster.restaraunt.geeksterRestarant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @PostMapping("/addRestaurant")
    public String addRestaurant(@RequestBody RestaurantModel restaurantModel){
        restaurantService.addRestaurant(restaurantModel);
        return "Restaurant has been added";
    }
    @GetMapping("/getAllRestaurant")
    public List<RestaurantModel> getAllRes(){
        return RestaurantService.getRestaurantAtService();
    }
    @GetMapping("/getRestaurant/{id}")
    public RestaurantModel getRestaurantbyid(@PathVariable Integer id){
        return restaurantService.getRestaurantbyId(id);
    }
    @PutMapping("/update-Restaurant/{restaurantSpecialty}")
    public RestaurantModel  updateRestaurant(@PathVariable String restaurantSpecialty,@RequestBody RestaurantModel model){
        return  restaurantService.updateRestaurant(restaurantSpecialty,model);
    }
    @DeleteMapping("/delete-Restaurant/{id}")
    public  String deleteRestaurant(@PathVariable int id){
        RestaurantModel model=restaurantService.deleteRestaurant(id);
        return "user deleted with Id "+id+"with data"+model.toString();
    }
}
