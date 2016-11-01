package com.hw4;

/**
 * Created by Aaron on 10/30/2016.
 */
public class StackUnderflowException extends RuntimeException
{
    public StackUnderflowException()
    {
        super();
    }

    public StackUnderflowException(String message)
    {
        super(message);
    }
}