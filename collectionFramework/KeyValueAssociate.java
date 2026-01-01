
/*Write a Java program to associate the specified value with the specified
 key in a HashMap.
 */
import java.util.Map;
import java.util.HashMap;
public class KeyValueAssociate {
    public static void main(String[] args) {
        Map<Integer, String> name = new HashMap<>();
        name.put(1, "Ram");
        name.put(45,"Amir");
        name.put(23,"Sandeep");
        name.put(4,"Sita");
        System.out.println(name);
        //Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("The number of key-value paris in HashMap:"+name.size());
        // Write a Java program to copy all of the mappings from the specified map to another map.


    }
}
