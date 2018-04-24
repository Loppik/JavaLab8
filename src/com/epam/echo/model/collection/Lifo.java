package com.epam.echo.model.collection;

public abstract class Lifo<Type> extends Box<Type> {
    abstract void push(Type o);
    abstract Type pop();
}
