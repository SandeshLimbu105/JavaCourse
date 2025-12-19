
import java.util.Scanner;
public class Construct {
    int length;
    int breadth;
    public Construct(int l, int b){
        this.length=l;
        this.breadth=b;
    }
public int area(){
        return (length*breadth);
}

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length");
        int len=sc.nextInt();
        System.out.println("Enter the breadth");
        int br=sc.nextInt();
        Construct cs=new Construct(len,br);
        System.out.println("The area is:" +cs.area());

    }
}
