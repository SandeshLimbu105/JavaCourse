
/*WAP a java program that takes a number and returns the length of the number.

 */
import java.util.Scanner;
public class Length {
    static int getLength(int num){
        return Integer.toString(num).length();
    }
    public static void main(String[] args){
        Scanner cs=new Scanner(System.in);
        System.out.println("Enter your choice\n 1.Iput for checking length\n 2.exit");
        int choice=cs.nextByte();
        while(choice!=2) {
            System.out.println("Enter the number:");
            int num = cs.nextByte();
            System.out.println("The length of entered number is:" + (getLength(num)));

        }

    }
}
