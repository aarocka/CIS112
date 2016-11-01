package com.hw4;

/**
 * Created by Aaron on 10/30/2016.
 */
public class StackOverflowException extends Exception
{
    public StackOverflowException()
    {
        super();
    }

    public StackOverflowException(String message)
    {
        super(message);
    }
}