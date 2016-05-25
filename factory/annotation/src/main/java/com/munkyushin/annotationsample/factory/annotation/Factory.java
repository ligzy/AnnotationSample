package com.munkyushin.annotationsample.factory.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by MunkyuShin on 5/23/16.
 */
@Target(ElementType.TYPE) @Retention(RetentionPolicy.CLASS)
public @interface Factory {
    Class type();

    String id();
}
