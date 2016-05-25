package com.munktyshin.annotationsample.factory.app.model;

import com.munkyushin.annotationsample.factory.annotation.Factory;

/**
 * Created by MunkyuShin on 5/25/16.
 */
@Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {
    public float getPrice() {
        return 2.3f ;
    }
}
