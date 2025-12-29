
/*Write a Java program to sort a given array list.*/
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Sort {
    public static void main(String[] args){
        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("mango");
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits);
        String searchItem="orange";
        //Java program to search an element in an array list.
        if(fruits.contains(searchItem)){
            System.out.println(searchItem +" " +"search item is found.");
        }
        else {
            System.out.println("Search item is not found.");
        }
    }
}
