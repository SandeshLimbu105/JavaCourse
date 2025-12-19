/* Write a program to print the area and perimeter of a triangle
 having sides of 3, 4 and 5 units by creating a class
 named 'Triangle' without any parameter in its constructor.
Area = sqrt(s *(s-side1)*(s-side2)*(s-side3))
 */

public class Triangle {
    public int side1;
    public int side2;
    public int side3;

    public Triangle(int s1, int s2, int s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    public double area() {
        double s;
        s = (side1 + side2 + side3) / 2;
        double a;
        a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return a;
    }
    public double perimeter(){
        double sc=side3+side2+side1;
        return sc;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("The area is:" +triangle.area());
        System.out.println("The perimeter is:" +triangle.perimeter());

    }
}
