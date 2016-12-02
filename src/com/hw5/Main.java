package com.hw5;

/**
 * Created by aaron on 10/23/2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(biPower(4));
        System.out.println(timesFive(6));
        if (palindromeIterative("poto")){
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
    }

    public static int sum(int n){
        if (n>0){
            return n+sum(n-1);
        }
        else
            return 0;

    }

    public static int biPower(int n){
        if (n>0){

            return 2*biPower(n-1);
        }
        else
            return 1;
    }

    public static int timesFive(int n){
        if (n>0){
            return 5+timesFive(n-1);
        }
        else
            return 0;
    }

    public static boolean palindromeIterative(String n){
        int last = n.length()-1;
        for (int first = 0; last>first; first++){
            if(n.charAt(first)!=n.charAt(last))
                return false;
            --last;
        }
        return true;
    }

    public static boolean palindromeRecursive(String n){
        //find the first and last letter of the sequence
        //check if they equal each other
        //if they do palindrome(substring)
        //if they don't return false
        if (n.length() == 0 || n.length() == 1){
            return true;
        }
        if (n.charAt(0)==n.charAt(n.length()-1)) {
            return palindromeRecursive(n.substring(1, n.length() - 1));
        }
        return false;
    }


}
