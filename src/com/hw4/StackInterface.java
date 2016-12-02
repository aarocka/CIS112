package com.hw4;

/**
 * Created by Aaron on 10/30/2016.
 */

public interface StackInterface<T>

{
    void pop() throws StackUnderflowException;
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.

    T top() throws StackUnderflowException;
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element from this stack.

    boolean isEmpty();
    // Returns true if this stack is empty, otherwise returns false.



    // Returns an element from the stack. This method counts from 1 where 1 is the top of the stack.


}