//Write a Java program to join two array lists.

import java.util.ArrayList;

public class Join {
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
        System.out.println("The array list after joining:" + color);

    }
}
