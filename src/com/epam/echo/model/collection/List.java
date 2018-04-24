package com.epam.echo.model.collection;

public class List<Type> extends Lifo<Type> {
    public List() {
        this.last = null;
        this.length = 0;
    }

    @Override
    public void push(Type element) {
        if(this.last == null) {
            this.last = new Element<>();
            this.last.setData(element);
            this.head = this.last;
            this.last.next = null;
        }
        else {
            Element<Type> temp = new Element<>();
            temp.setData(element);
            temp.next = null;
            this.last.next = temp;
            this.last = temp;
        }
        this.length++;
    }

    @Override
    public Type pop() {
        if (this.isEmpty()) {
            return null;
        }
        while (this.last.next != null) {
            this.last = this.last.next;
        }
        Element<Type> temp = new Element<>();
        temp.setData(this.last.getData());
        this.last.pref.next = null;
        this.last = this.head;
        this.length--;
        return temp.getData();
    }

    Type delete(Type o) {
        while (this.last.next != null) {
            if (this.last.getData() == o) {
                return this.last.getData();
            }
        }
        return null;
    }
}
