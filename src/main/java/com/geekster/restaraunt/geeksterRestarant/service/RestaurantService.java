package com.geekster.restaraunt.geeksterRestarant.service;

import com.geekster.restaraunt.geeksterRestarant.doa.RestaurantDao;
import com.geekster.restaraunt.geeksterRestarant.model.RestaurantModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantDao restaurantDao;
    public void addRestaurant(RestaurantModel restaurantModel) {
        restaurantDao.addRestaurant(restaurantModel);
    }

    public static List<RestaurantModel> getRestaurantAtService() {
        return RestaurantDao.getRestaurantAtRepo();
    }

    public RestaurantModel getRestaurantbyId(Integer id) {
        return  restaurantDao.getRestaurantbyId(id);
    }

    public RestaurantModel updateRestaurant(String restaurantSpecialty, RestaurantModel model) {
        return restaurantDao.updateRestaurant(restaurantSpecialty,model);
    }

    public RestaurantModel deleteRestaurant(int id) {
        return restaurantDao.deleteRestaurant(id);
    }
}
