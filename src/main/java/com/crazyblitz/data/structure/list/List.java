package com.crazyblitz.data.structure.list;

import com.crazyblitz.data.structure.iterator.Iterable;

public interface List<T> extends Iterable<T> {

    boolean add(T element);

    boolean remove(Object element);

    void clear();

    int size();

    boolean contains(Object o);

    boolean isEmpty();
}
