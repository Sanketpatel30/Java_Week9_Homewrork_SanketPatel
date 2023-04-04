package Programmes;

/* 6. Write a Java program to retrieve an element (at a specified index) from a given array list */

import java.util.ArrayList;

public class Programme6ElementsArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("Leo");
        list.add("Max");
        list.add("Diyen");
        list.add("Veer");
        list.add("Kelvin");

        System.out.println("The element index in Arraylist is: " + list.get(2));
    }
}
