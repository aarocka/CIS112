package com.hw4;

/**
 * Created by Aaron on 10/30/2016.
 */

public class LinkedStack<T> implements UnboundedStackInterface<T>
{
    protected LLNode<T> top;   // reference to the top of this stack

    public LinkedStack()
    {
        top = null;
    }

    public void push(T element)
    // Places element at the top of this stack.
    {
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.setLink(top);
        top = newNode;
    }

    public void pop()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    {
        if (!isEmpty())
        {
            top = top.getLink();
        }
        else
            throw new StackUnderflowException("Pop attempted on an empty stack.");
    }

    public T top()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element from this stack.
    {
        if (!isEmpty())
            return top.getInfo();
        else
            throw new StackUnderflowException("Top attempted on an empty stack.");
    }

    public boolean isEmpty()
    // Returns true if this stack is empty, otherwise returns false.
    {
        if (top == null)
            return true;
        else
            return false;
    }

    //TODO

    @Override
    public String toString() {
        return "LinkedStack{" +
                "top=" + top +
                '}';
    }
}
