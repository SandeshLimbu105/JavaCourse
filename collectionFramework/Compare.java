/*Write a Java program to compare two array lists.
Write a Java program to trim the capacity of an array list the current list size.
 */


import java.util.ArrayList;
public class Compare {
    public static void main(String[] args){
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        ArrayList<String> fruits1=new ArrayList<>();
        fruits1.add("banana");
        fruits1.add("apple");
        fruits1.add("orange");
        //compare two array list by using equals method
        if(fruits.equals(fruits1)){
            System.out.println("The array list are equal:");
        }
        else {
            System.out.println("The array list are not equal:");
        }
    }
}
