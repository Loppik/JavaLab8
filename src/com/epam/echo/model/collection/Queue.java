package com.epam.echo.model.collection;

public class Queue<Type> extends Fifo<Type> {
    public Queue() {
        this.last = null;
        this.length = 0;
    }

    @Override
    public void add(Type element) {
        if (this.last == null) {
            this.last = new Element<>();
            this.last.setData(element);
            this.last.next = null;
            this.head = this.last;
        }
        else {
            Element<Type> temp = new Element<>();
            temp.next = this.last;
            temp.setData(element);
            this.last = temp;
            this.head = temp;
        }
        this.length++;
    }

    @Override
    public Type remove() {
        if (this.isEmpty()) {
            return null;
        }
        while (this.last.next.next != null) {
            this.last = this.last.next;
        }
        Element<Type> temp = new Element<>();
        temp.setData(this.last.next.getData());
        this.last.next = null;
        this.last = this.head;
        this.length--;
        return temp.getData();
    }
}
