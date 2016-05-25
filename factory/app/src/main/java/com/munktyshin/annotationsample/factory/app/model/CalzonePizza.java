package com.munktyshin.annotationsample.factory.app.model;

import com.munkyushin.annotationsample.factory.annotation.Factory;

/**
 * Created by MunkyuShin on 5/25/16.
 */

@Factory(
    id =  "CalzonePizza",
        type = Meal.class
)
public class CalzonePizza implements Meal {
    public float getPrice() {
        return 10f;
    }
}
