/*Write a Java program to append the specified element to the end of a linked list.
Write a Java program to iterate through all elements in a linked list.
Write a Java program to get the first and last occurrence of the specified elements in a linked list.
Write a Java program of swap two elements in a linked list
Write a Java program to insert the specified element at the specified position in the linked list.
*/
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
public class LInked_list_append {
    public static void main(String[] args){
        LinkedList<String> countries=new LinkedList<>();
        countries.add("Nepal");
        countries.add("India");
        countries.add("Bangladesh");
        countries.addLast("China");

        System.out.println(countries);
        //iterate through all element in linked list
        for(String country:countries){
            System.out.println(country);
        }
        System.out.println("Get first element in list:" +countries.getFirst());
        System.out.println("Get last element in list:" +countries.getLast());
        // swapping element of index 1 and 2 using swap method of class Collections
        Collections.swap(countries,1,2);
        System.out.println(countries);
        //Write a Java program to insert the specified element at the specified position in the linked list.
        countries.add(3,"Kuwait");
        System.out.println(countries);


    }
}
