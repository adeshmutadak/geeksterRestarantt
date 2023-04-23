package com.geekster.restaraunt.geeksterRestarant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantModel {

    private int id;
    private String restaurantName;
    private String restaurantAddress;
    private String number;
    private String restaurantSpecialty;
    private  String totalStaff;
}
