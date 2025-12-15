/* Assign and print the roll number, phone number and address of two students
 having names "Sam" and "John" respectively by creating
  two objects of class 'Student'.
 */
public class Student1 {
    String name;
    int roll_no;
    String phone_no;
    String address;

    public static void main(String[] args) {

        Student1 st1 = new Student1();
        Student1 st2 = new Student1();

        st1.name = "Sam";
        st1.roll_no = 23;
        st1.phone_no = "9800000000";
        st1.address = "KTM";

        st2.name = "John";
        st2.roll_no = 1;
        st2.phone_no = "9800500000";
        st2.address = "PKR";

        System.out.println("First Student Information:");
        System.out.println("Name: " + st1.name);
        System.out.println("Roll No: " + st1.roll_no);
        System.out.println("Phone No: " + st1.phone_no);
        System.out.println("Address: " + st1.address);

        System.out.println("\nSecond Student Information:");
        System.out.println("Name: " + st2.name);
        System.out.println("Roll No: " + st2.roll_no);
        System.out.println("Phone No: " + st2.phone_no);
        System.out.println("Address: " + st2.address);
    }
}
