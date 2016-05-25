package com.munktyshin.annotationsample.factory.app.model;

import com.munkyushin.annotationsample.factory.annotation.Factory;

/**
 * Created by MunkyuShin on 5/25/16.
 */
@Factory(
        id = "Margherita Pizza",
        type = Meal.class
)
public class MargheritaPizza implements Meal{

    public float getPrice() {
        return 8.5f;
    }
}
