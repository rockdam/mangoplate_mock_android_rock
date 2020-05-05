package com.example.mangoplate.src.home.search_restaurant.models;

import java.util.List;

public class RestaurantResultList {
    List<RestaurantResult> result;
    boolean isSuccess;
    int code;
    String message;

    public List<RestaurantResult> getResult() {
        return result;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
