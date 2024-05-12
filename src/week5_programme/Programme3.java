package week5_programme;

/**
 * 3. Write a Java program to reverseOfArray an array of integer values.
 */
public class Programme3 {
    public static void main(String[] args) {
        reverseOfArray();                           //Calling method
    }

    static void reverseOfArray() {
        int a[] = {1, 2, 3, 4, 5};                 //Array a
        int n = a.length;
        int b[] = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {               //Giving values to array b
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: ");  // printing the reversed array
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }


}
