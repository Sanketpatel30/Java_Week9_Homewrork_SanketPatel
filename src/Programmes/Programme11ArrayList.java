package Programmes;
/*Declare following two arraylist and compare it.*/

import java.util.ArrayList;

public class Programme11ArrayList {

    public static void main(String[] args) {
        // create two Array List
        ArrayList<String> c1 = new ArrayList<String>();
        ArrayList<String> c2 = new ArrayList<String>();

        // insert items in ArrayList 1
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // insert items in ArrayList 2
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Display both ArrayList
        System.out.println(" ArrayList1 = " + c1);
        System.out.println(" ArrayList1 = " + c2);

        // compare ArrayList1 with ArrayList2
        if (c1.equals(c2) == true) {
            System.out.println(" Array List are equal");
        } else
        // else block execute when
        // ArrayList are not equal
        {
            System.out.println(" Array List are not equal");
        }

        // insert one more item in ArrayList 1
        System.out.println(
                "\n Lets insert one more item in Array List 1");
        c1.add("item 5");

        // display both ArrayList
        System.out.println(" ArrayList1 = " + c1);
        System.out.println(" ArrayList = " + c2);

        // again compare ArrayList 1 with ArrayList 2
        if (c1.equals(c2) == true) {
            System.out.println(" Array List are equal");
        } else {
            System.out.println(" Array List are not equal");
        }
    }
}