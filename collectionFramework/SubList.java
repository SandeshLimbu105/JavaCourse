

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class SubList {
    public static void main(String[] args){
        List<String> color=new ArrayList<>();
        color.add("apple");
        color.add("jackfruit");
        color.addAll(Arrays.asList("banana", "orange", "pineapple"));
        List<String> subcolor=color.subList(0,3);
        System.out.println("Original:"+color);
        System.out.println("Sub-array:"+subcolor);
    }
}
