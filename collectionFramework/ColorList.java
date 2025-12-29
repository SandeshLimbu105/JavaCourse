
/*1.Write a Java program to create a new array list,
add some colors (string) and print out the collection.
2.How will you reverse a List?
 */

import java.util.ArrayList;
import java.util.Collections;
public class ColorList {
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Black");

        // Java program to retrieve an element (at a specified index) from a given array list.

        System.out.println("The element at index 2:"+arrayList.get(2));
        //size method is used to return the number of element present in arraylist
        System.out.println("The number of elements:"+arrayList.size());
        System.out.println(arrayList);
        //Java program to iterate through all elements in an array list.
        for(String list:arrayList){
            System.out.println(list);
        }
        //lis is reverse using Collections.reverse method as below
        // Collections.reverse method belong to built in class of java.util package
        Collections.reverse(arrayList);
        System.out.println("The element of arraylist after reversal"+arrayList);
        for(String rv:arrayList){
            System.out.println(rv);

        }
        // Java program to remove the third element from an array list.
        System.out.println("Remove the third element:"+arrayList.remove(2));
        System.out.println(arrayList);


    }
}
