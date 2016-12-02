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
    
    public int sizeIs(){
        int nodeCount=0;
        LLNode<T> currNode = top;
        while (currNode != null){
            nodeCount++;
            currNode = currNode.getLink();
        }
        return nodeCount;
    }

    public T inspector(int location) {
        if (location <= 0 || location > sizeIs()){
            return null;
        }
        location--; // this is needed because for some reason the problem in the book wants this method to count from 1
        LLNode<T> currNode = top;
        for (int i=0; i<location; i++){
            currNode = currNode.getLink();
        }

        return currNode.getInfo();
    }

    
    public void popSome(int count) {
        //this code breaks if i want to remove negative elements
        if (count <= sizeIs()) {
            for (int i = 0; i < count; i++) {
                pop();
            }
        }
        else
            throw new StackUnderflowException("More elements were removed than exist. " +
                    "I'm going to pretend you never tried to do this in the first place");
    }

    @Override
    public String toString() {

        String stringify="LinkedStack{";
        LLNode<T> currNode = top;
        while (currNode != null){
            stringify = stringify + currNode.getInfo();
            currNode = currNode.getLink();
            if (currNode!=null)
                stringify=stringify+", ";
        }
        stringify = stringify + "}";
        return stringify;
    }
}
