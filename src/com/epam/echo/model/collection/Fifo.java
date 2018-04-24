package com.epam.echo.model.collection;

public abstract class Fifo<Type> extends Box<Type> {
    abstract void add(Type o);
    abstract Type remove();

    @Override
    public void printAll() {
        this.last = this.head;
        while (this.last != null) {
            System.out.println(this.last.getData());
            this.last = this.last.next;
        }
    }
}
