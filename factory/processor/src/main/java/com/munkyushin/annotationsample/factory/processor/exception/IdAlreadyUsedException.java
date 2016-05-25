package com.munkyushin.annotationsample.factory.processor.exception;

import com.munkyushin.annotationsample.factory.processor.model.FactoryAnnotatedClass;

/**
 * Created by MunkyuShin on 5/25/16.
 */
public class IdAlreadyUsedException extends Exception {
    FactoryAnnotatedClass mItem;

    public IdAlreadyUsedException(FactoryAnnotatedClass item) {
        mItem = item;
    }
}
