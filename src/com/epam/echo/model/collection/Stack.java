package com.epam.echo.model.collection;

public class Stack<Type>  extends Lifo<Type>{
    public Stack(){
        this.last = null;
        this.length = 0;
    }

    @Override
    public void push(Type element) {
        if(this.last == null) {
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
    public Type pop() {
        if (this.isEmpty()) {
            return null;
        }
        Element<Type> temp = new Element<>();
        temp.setData(this.last.getData());
        this.last = this.last.next;
        this.head = this.last;
        this.length--;
        return temp.getData();
    }



}
