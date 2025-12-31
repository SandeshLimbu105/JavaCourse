
import java.util.Set;
import java.util.HashSet;

public class ImplementSet {
    public static void main(String[] args) {
        HashSet<String> student = new HashSet<>();
        student.add("Samir");
        student.add("Shanti");
        student.add("Summit");
        student.add("Dinesh");
        student.add("Dinesh");
        System.out.println(student);
        // use contains method to check whether element is present in set or not , it returned boolean value
        String check="Dinesh";
        System.out.println("contains:"+check+" "+student.contains(check));
        //used remove method to remove the element from set
        student.remove("Summit");
        System.out.println(student);


    }
}
