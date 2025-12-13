
/* Read the input values from user we have to use Scanner class.
  Scanner is the parts of java package that allows us to read input from keyboard.
  syntax:
  Scanner ob= new Scanner(System.in);
  here scanner is class and ob is object of scanner class.
  system.in is inputs from keyboards.
 */
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your age:");
        int num1=ob.nextInt();
        System.out.println("The your is:" +num1);



    }
}
