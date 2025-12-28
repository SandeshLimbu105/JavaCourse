/*Write a program in java  to swap two numbers using a function.
 */

public class SwapNumber {

    static void swapFunction(int n1,int n2){
        int temp;
        System.out.println("The first number:" +n1);
        System.out.println("The second number:" +n2);
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("The first number:" +n1);
        System.out.println("The second number:" +n2);

    }
    public static void main(String[] args){

        swapFunction(12,45);

    }
}
