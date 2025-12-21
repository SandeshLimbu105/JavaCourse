/*
A person is eligible to vote if his/her age is greater than or
equal to 18. Define a method to find out if he/she is eligible to vote.

*/
import java.util.Scanner;
public class Vote {
    public int age;

    public Vote(int a) {
        this.age = a;
    }

    int check_eligibility() {
        if (age >= 18) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("your are not eligible for voting:");
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice \n 1.Enter your age \n 2.exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your age:");
                    int ag = scanner.nextInt();
                    Vote vote = new Vote(ag);
                    System.out.println(+vote.check_eligibility());
                case 2:
                    System.out.println("you exit:");
                    break;
                default:
                    System.out.println("You enter invalid");
            }
        }
        while(choice!=2);
    }
}