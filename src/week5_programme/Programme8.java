package week5_programme;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme8 {
    public static void main(String[] args) {
        isNumberInHashSet();                                //Calling method
    }

    public static void isNumberInHashSet() {
        HashSet<Integer> numberSet = new HashSet<>();       //Creating hashset
        numberSet.add(4);                                   //Adding 4,7,8 to hashset
        numberSet.add(7);
        numberSet.add(8);

        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {                    //Cheking if set contains particular value using contains
                System.out.println(i + " is in numberSet.");
            } else {
                System.out.println(i + " is not in numberSet.");
            }
        }
    }
}
