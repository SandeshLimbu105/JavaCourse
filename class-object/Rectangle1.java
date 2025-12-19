/* Write a program to print the area of two rectangles having sides (4,5)
and (5,8) respectively by creating a class named 'Rectangle' with a method
 named 'Area' which returns the area and length and breadth passed as
 parameters to its constructor.
 */
public class Rectangle1 {
    public int length;
    public int breadth;
    public Rectangle1(int l, int b){
        this.length=l;
        this.breadth=b;
    }
    int area(){
        return (length*breadth);
    }
    public static void main(String[] args){
        Rectangle1 rec1=new Rectangle1(5,4);
        Rectangle1 rec2=new Rectangle1(8,5);
        System.out.println("The area of rectangle 1:" +rec1.area());
        System.out.println("The area of rectangle 2:" +rec2.area());
    }

}
