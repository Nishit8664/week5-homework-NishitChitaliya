package calculate;

/**
 * 1. Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */
public class Calculator {
    public void addition(int a, int b) {                //Addition method
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is: " + result);
    }

    public void subtraction(int a, int b) {             //Substraction method
        int result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + result);
    }

    public void division(int a, int b) {                //Division method
        if (b != 0) {
            int result = a / b;
            System.out.println("Division of " + a + " by " + b + " is: " + result);
        } else {
            System.out.println("Not divisible by zero.");
        }
    }

    public void multiplication(int a, int b) {              //Multiplication method
        int result = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + result);
    }

    public void calculateResult(int a, int b, char symbol) {        //Cal result method
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else {
            System.out.println("Invalid symbol");
        }
    }
}
