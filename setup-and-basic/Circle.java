
/* Write a program to print the circumference and area of a circle of radius
entered by the user by defining your own method.
*/



import java.util.Scanner;
public class Circle {
    public double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double circumference(double radius){
        return (2*3.14166*radius);
    }
    public double area(double radius){
        return (3.14166*radius*radius);
    }
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double r=ob.nextFloat();
        Circle circle= new Circle();
        double cir=circle.circumference(r);
        double ar=circle.area(r);
        System.out.println("The circumference is:" +cir);
        System.out.println("The area of rectangle is :" +ar);
    }
}
