package week5_programme;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme7 {
    public static void main(String[] args) {
        isArrayListEmpty();                                             //Calling method
    }

    public static void isArrayListEmpty() {
        ArrayList<Integer> numberList = new ArrayList<>();              //Creating empty arrayList
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Surat");
        cityList.add("Birmingham");

        //Checking if array list is empty or not using isEmpty() method
        if (numberList.isEmpty()) {
            System.out.println("numberList is a empty ArrayList.");
        }

        //Checking if array list is empty or not using isEmpty() method
        if (!(cityList.isEmpty())) {
            System.out.println("cityList is not empty ArrayList.");
        }
    }
}
