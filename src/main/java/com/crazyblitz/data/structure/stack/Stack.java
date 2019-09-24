package com.crazyblitz.data.structure.stack;

public interface Stack<T> {

    T push(T item);

    T pop();

    boolean isEmpty();
}
