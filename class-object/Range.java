import java.util.Scanner;

public class Range {

    void display(int start, int end) {
        while (start <= end) {
            System.out.println(start);
            start++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        Range rn = new Range();
        rn.display(start, end);
    }
}
