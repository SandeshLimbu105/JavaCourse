
//Write a Java program to trim the capacity of an array list the current list size.
import java.util.ArrayList;
public class Trim {
    public static void main(String[] args){
        ArrayList<String> color=new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Black");
        ArrayList<String> color1=new ArrayList<>();
        color1.add("yellow");
        color1.add("while");
        color1.add("blue");
        color.addAll(color1);
        color.trimToSize();
        System.out.println("The array list after trim:" + color);

    }
}
