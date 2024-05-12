package week5_programme;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme9 {
    public static void main(String[] args) {
        iterateHashMap();                                           //Calling method
    }

    public static void iterateHashMap() {
        Map<String, Integer> people = new HashMap<>();              //Creating hashmap
        people.put("Nishit", 01);                                   //Putting values
        people.put("Dhwani", 02);
        people.put("Ankita", 03);
        people.put("Savan", 04);
        people.put("Shubham", 05);
        for (Map.Entry<String, Integer> person : people.entrySet()) {      //Iterating values
            System.out.println("Id no of " + person.getKey() + " is " + person.getValue());
        }
    }
}
