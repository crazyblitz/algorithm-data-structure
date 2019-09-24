package com.crazyblitz.data.structure.queue;

public class CycleArrayQueue<T> implements Queue<T> {
    @Override
    public boolean offer(T e) {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
