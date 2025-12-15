/* Write a program to print the area of a rectangle by creating a class named Rectangle
having two methods. First method named as 'setDim' takes length and breadth of the rectangle
as parameters and the second method named as 'getArea' returns the area of the rectangle.
Length and breadth of the rectangle are entered through the keyboard.
 */
import java.util.Scanner;
public class Rectangle {
    int length;
    int breadth;

    public void setDim(int l, int b){
        length=l;
        breadth=b;

    }
public int getArea() {
    return length * breadth;
}
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the length");
        int length= ob.nextInt();
        System.out.println("Enter the breadth");
        int breadth= ob.nextInt();
        Rectangle ob1= new Rectangle();
        ob1.setDim(length,breadth);
        System.out.println("The area is:" +ob1.getArea());

    }

}
