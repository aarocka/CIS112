package com.hw4;

/**
 * Created by Aaron on 10/30/2016.
 */

public interface BoundedStackInterface<T> extends StackInterface<T>

{
    void push(T element) throws StackOverflowException;
    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.

    boolean isFull();
    // Returns true if this stack is full, otherwise returns false.

}