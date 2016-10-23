package com.hw3;

/**
 * Created by aaron on 10/23/2016.
 */
public interface MC3ListOperations {
    void add(Object o);
    void clear();
    int indexOf(Object o);
    boolean isEmpty();
    Object remove(int index);
    Object get(int index);
    Object set(int index, Object o);
    int size();
    String toString();
}
