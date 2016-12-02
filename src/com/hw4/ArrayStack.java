package com.hw4;

/**
 * Created by Aaron on 11/12/2016.
 */
public class ArrayStack<T> implements BoundedStackInterface<T>
{
    protected final int DEFCAP = 100; // default capacity
    protected T[] stack;              // holds stack elements
    protected int topIndex = -1;      // index of top element in stack

    public ArrayStack()
    {
        stack = (T[]) new Object[DEFCAP];
    }

    public ArrayStack(int maxSize)
    {
        stack = (T[]) new Object[maxSize];
    }

    public void push(T element) throws StackOverflowException
    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.
    {
        if (!isFull())
        {
            topIndex++;
            stack[topIndex] = element;
        }
        else
            throw new StackOverflowException("Push attempted on a full stack.");
    }

    public void pop()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    {
        if (!isEmpty())
        {
            stack[topIndex] = null;
            topIndex--;
        }
        else
            throw new StackUnderflowException("Pop attempted on an empty stack.");
    }

    public T top()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element from this stack.
    {
        T topOfStack = null;
        if (!isEmpty())
        {
            topOfStack = stack[topIndex];
            return topOfStack;
        }
        else
            throw new StackUnderflowException("Top attempted on an empty stack.");
    }

    public boolean isEmpty()
    // Returns true if this stack is empty, otherwise returns false.
    {
        if (topIndex == -1)
            return true;
        else
            return false;
    }

    public boolean isFull()
    // Returns true if this stack is full, otherwise returns false.
    {
        if (topIndex == (stack.length - 1))
            return true;
        else
            return false;
    }

    public int sizeIs(){

        return topIndex + 1;
    }
}