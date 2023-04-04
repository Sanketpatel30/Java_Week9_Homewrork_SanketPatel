package Programmes;
/* 7. Write a Java program to test an array list is empty or not. */

import java.util.ArrayList;

public class Programme7ArrayListEmptyOrNot {

    public static void main(String[] args) {

        // creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(10);

        // check if the list is empty or not using function
        boolean ans = arr.isEmpty();
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");

        // addition of a element to the ArrayList
        arr.add(1);

        // check if the list is empty or not
        ans = arr.isEmpty();
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");
    }
}