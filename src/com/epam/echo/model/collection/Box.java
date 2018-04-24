package com.epam.echo.model.collection;

import com.epam.echo.model.entity.Ornamentals;

public abstract class Box<Type> implements Collection<Type> {
    public Element<Type> head;
    public Element<Type> last;
    public int length;

    @Override
    public int getSize() {
        return this.length;
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    public void printAll() {
        while (this.last != null){
            System.out.println(this.last.getData());
            this.last = this.last.next;
        }
        this.last = this.head;
    }
}
