package com.greenfox.foxclub.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NutritionService {
   private List<String> foods;
   private List<String> drinks;

    public NutritionService() {
        this.foods = new ArrayList<>(Arrays.asList(
                "Pizza",
                "Salad",
                "Fish",
                "Chicken"
        ));
        this.drinks = new ArrayList<>(Arrays.asList(
                "Cola",
                "Milk",
                "Water",
                "Energy Drink"
        ));
    }

    public List<String> getFoods() {
        return foods;
    }

    public void setFoods(List<String> foods) {
        this.foods = foods;
    }

    public List<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<String> drinks) {
        this.drinks = drinks;
    }
}
