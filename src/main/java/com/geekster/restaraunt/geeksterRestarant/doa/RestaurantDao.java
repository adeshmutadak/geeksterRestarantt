package com.geekster.restaraunt.geeksterRestarant.doa;

import com.geekster.restaraunt.geeksterRestarant.model.RestaurantModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {
    static List<RestaurantModel> list=new ArrayList<>();
    public void addRestaurant(RestaurantModel restaurantModel) {
        list.add(restaurantModel);
    }

    public static List<RestaurantModel> getRestaurantAtRepo() {
        return list;
    }

    public RestaurantModel getRestaurantbyId(Integer id) {
        for(RestaurantModel res:list){
            if(res.getId()==id){
                return res;
            }
        }
        return null;
    }

    public RestaurantModel updateRestaurant(String restaurantSpecialty, RestaurantModel model) {
        for(RestaurantModel res:list) {
            if (res.getRestaurantSpecialty() == restaurantSpecialty) {
                model.setNumber(model.getNumber());
                model.setRestaurantName(model.getRestaurantName());
                model.setRestaurantAddress(model.getRestaurantName());
                model.setNumber(model.getNumber());
                return model;
            }
        }
        return null;
    }

    public RestaurantModel deleteRestaurant(int id) {
        RestaurantModel model=getRestaurantbyId(id);
        boolean remove=list.remove(model);
        if(remove){
            return model;
        }else{
            return null;
        }
    }
}
