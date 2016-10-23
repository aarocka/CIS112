package com.hw2;

/**
 * Created by aaron on 10/23/2016.
 */
public interface MC3ListOperations {
    public void add(Object o);
    public void clear();
    public void ensureCapacity(int minCapacity);
    public int indexOf(Object o);
    public boolean isEmpty();
    public Object remove(int index);
    public Object get(int index);
    public Object set(int index, Object o);
    public int size();
    public String toString();
}