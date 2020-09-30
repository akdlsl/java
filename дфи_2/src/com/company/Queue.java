package com.company;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> nodeList;

    Queue(){
        nodeList = new LinkedList();
    }

    public void add(T element)
    {
        nodeList.addLast(element);
    }

    public T remove()
    {
       return nodeList.removeFirst();
    }
}
