package com.crazyblitz.data.structure.queue;

public interface Queue<T> {

    boolean offer(T e);

    T peek();

    int size();

    boolean isEmpty();
}
