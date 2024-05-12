package week5_programme;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme4 {
    public static void main(String[] args) {
        printOutArrayList();            //Calling method
    }

    public static void printOutArrayList() {
        ArrayList<String> colours = new ArrayList<>();          //Declaring arraylist
        colours.add("Yellow");
        colours.add("Green");                                   //Adding values
        colours.add("Black");
        colours.add("Brown");
        colours.add("Blue");

        for (String color : colours) {                          //Printing values
            System.out.println(color);
        }
    }
}
