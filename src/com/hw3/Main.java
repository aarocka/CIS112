package com.hw3;

import java.util.Arrays;

/**
 * Created by aaron on 10/23/2016.
 */
public class Main {

    public static void main(String[] args) {
        /*
        Object firstThing = "This is the first link in the chain";
        Object secondThing = "This is the second link in the chain";
        LLObjectNode a = new LLObjectNode(firstThing);
        LLObjectNode b = new LLObjectNode(secondThing);
        a.setLink(b);

        System.out.println(a.toString());

        //Traverse
        LLObjectNode currNode = a;
        while (currNode != null){
            System.out.println(currNode.getInfo());
            currNode=currNode.getLink();
        }

        //Insertion at beginning
        LLObjectNode first = new LLObjectNode("This is to be inserted at the beginning of the linked list");
        first.setLink(a);
        a = first;

        System.out.println(a.toString());

        currNode = a;
        while (currNode != null){
            System.out.println(currNode.getInfo());
            currNode=currNode.getLink();
        }
        */

        //////////////////////////////////////////////
        ///
        //////////////////////////////////////////////

        MC3ArrayList myList = new MC3ArrayList();
        myList.add("this should be the first node");
        System.out.println(myList.toString());
        myList.add("This should be the second node");
        System.out.println(myList.toString());
        myList.add("This should be the third node");
        System.out.println(myList.toString());
        System.out.println(myList.size());
        myList.clear();
        System.out.println(myList.size());


        Object[] exampleObject = {"Element 1",2,30};
        MC3ArrayList otherList = new MC3ArrayList(exampleObject);
        System.out.println(otherList.toString());
        System.out.println(otherList.indexOf("Element 1"));
        System.out.println(otherList.indexOf("agcldekjalkjd"));
        System.out.println(otherList.indexOf(2));
        System.out.println(otherList.indexOf(30));
        System.out.println(otherList.get(1));
        otherList.set(1,"insert");
        System.out.println(otherList.toString());
        System.out.println(otherList.remove(1));
        System.out.println(otherList.toString());
    }

}
