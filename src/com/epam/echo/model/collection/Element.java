package com.epam.echo.model.collection;

public class Element<Type> {
    private Type data;
    public Element<Type> next;
    public Element<Type> pref;

    public Type getData() {
        return data;
    }

    public void setData(Type data) {
        this.data = data;
    }
}
