/*WAP to print the multiplication table of a number
using a function printMultiplication(int inputNumber)

 */
public class Multiplication {

    // Function to print multiplication table of a given number
    // here we specified printMultiplication as static to make work without object of class
    // it mean that it belongs to class , not object of class
    static void printMultiplication(int inputNumber) {
        for (int i = 1; i <= 10; i++) {
            int result = inputNumber * i;
            System.out.println(inputNumber + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        printMultiplication(8); // Print multiplication table of 8
    }
}

