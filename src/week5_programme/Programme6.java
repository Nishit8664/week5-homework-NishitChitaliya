package week5_programme;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme6 {
    public static void main(String[] args) {
        retrieveAnElementOfArrayList();                 //Calling method
    }
    public static void retrieveAnElementOfArrayList(){
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1000);                               //Adding value
        number.add(2000);
        number.add(3000);
        number.add(4000);

        System.out.println(number.get(3));              //Getting value 4000
    }
}
