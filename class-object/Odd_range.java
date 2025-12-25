/*WAP that displays all the odd numbers from range
 void displayOddNumbers(int start , int end)
 */

import java.util.Scanner;
public class Odd_range {
    void displayOddNumbers(int start, int end){
        for(int i=start;i<=end;i++){
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start point of number:");
        int start=sc.nextInt();
        System.out.println("Enter end point of the number:");
        int end=sc.nextInt();
        Odd_range od=new Odd_range();
        od.displayOddNumbers(start,end);

    }
}
