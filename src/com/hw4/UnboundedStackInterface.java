package com.hw4;

/**
 * Created by Aaron on 10/30/2016.
 */
public interface UnboundedStackInterface<T> extends StackInterface<T>

{
    void push(T element);
    // Places element at the top of this stack.

}