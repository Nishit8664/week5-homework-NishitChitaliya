package week5_programme;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme5 {
    public static void main(String[] args) {
        iterateArrayList();                     //Calling method
    }

    public static void iterateArrayList() {
        ArrayList<String> country = new ArrayList<>();      //Creating arraylist
        country.add("India");                               //Adding value
        country.add("England");
        country.add("Ireland");
        country.add("Germany");
        country.add("America");

        Iterator<String> iterator = country.iterator();      //Creating iterator

        System.out.println("Elements of array list using iterator: ");
        while (iterator.hasNext()) {                        //Printing using iterator
            String country1 = iterator.next();
            System.out.println(country1);
        }
    }
}
