package com.hw4;

import java.util.ArrayList;

/**
 * Created by aaron on 10/23/2016.
 */
public class Main {

    public static void main(String[] args) {
        LinkedStack<String> superCoolStack = new LinkedStack<>();
        superCoolStack.push("I was pushed first");
        superCoolStack.push("I was pushed second");
        superCoolStack.push("I was pushed third");

        System.out.println(superCoolStack.inspector(1));
        System.out.println(superCoolStack.inspector(2));
        System.out.println(superCoolStack.inspector(3));
        System.out.println(superCoolStack.inspector(4));
        System.out.println(superCoolStack.inspector(0));
        System.out.println(superCoolStack.toString());
        superCoolStack.pop();

        try {
            superCoolStack.popSome(4);
        }
        catch (StackUnderflowException SFE){
            System.out.println("Hello, you tried to remove too many elements from a stack");
        }
        superCoolStack.popSome(2);
        System.out.println(superCoolStack.toString());

        ArrayStack<String> superHotStack = new ArrayStack<>();
        try {
            superHotStack.push("hello 1");
            superHotStack.push("hello 2");
            superHotStack.push("hello 3");
        } catch (StackOverflowException e) {
            e.printStackTrace();
        }

        System.out.println(superHotStack.sizeIs());

    }

}
