package com.hw2;

import java.lang.reflect.Array;

/**
 * Created by aaron on 10/23/2016.
 */
public class Main {

    public static void main(String[] args) {
        MC3ArrayList a = new MC3ArrayList(3); // Initial capacity of 10
        a.add("1st");
        a.add("2nd");
        a.add("3rd");
        System.out.println(a.toString());
        System.out.println("array size:"+a.size());
        a.add("4nd");
        System.out.println(a.toString());
        System.out.println("array size:"+a.size());
        a.ensureCapacity(10);
        a.add("5th");
        a.add("6th");
        a.add("7th");
        a.add("8th");
        a.add("9th");
        a.add("10th");
        System.out.println(a.toString());
        System.out.println("array size:"+a.size());
        System.out.println(a.get(9));
        a.set(1,"Insertion");
        System.out.println(a.toString());
        System.out.println("array size:"+a.size());
        a.remove(1);
        System.out.println(a.toString());
        System.out.println("array size:"+a.size());

        if(a.indexOf("nest")!=-1){
            System.out.println(a.indexOf("nest"));
        }else {
            System.out.println("not found");
        }

        a.set(2,"3rd");

        if(a.indexOf("3rd")!=-1){
            System.out.println(a.indexOf("3rd"));
        }else {
            System.out.println("not found");
        }
        a.clear();
        System.out.println(a.isEmpty());

        Object[] myArray= {1,3,5,6,7,25,"12"};
        MC3ArrayList b = new MC3ArrayList(myArray);
        System.out.println(b.toString());
    }

}
