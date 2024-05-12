package week5_programme;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme11 {
    public static void main(String[] args) {
        compareArrayList();                                     //Calling method
    }

    public static void compareArrayList() {
        ArrayList<String> c1 = new ArrayList<String>();         //Delcaring c1 list
        c1.add("Red");                                          //Adding values to c1 list
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();         //Delcaring c2 list
        c2.add("Red");                                          //Adding values to c2 list
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        if (c1.equals(c2)) {                                     //Comparing c1 and c2
            System.out.println("c1 is same as c2.");
        } else {
            System.out.println("c1 is not same as c2.");
        }
    }
}
