

import java.util.*;
import java.util.List;

public class Qn1 {
  public static void main(String[] args) {
     /* ArrayList<String> objs=new ArrayList<String>();
      objs.add("apple");
      objs.add("orange");
      objs.add("lemon");
      objs.add("banana");
      String[] data= objs.toArray(new String[0]);
      System.out.println(data);
      for(String arr:objs){
          System.out.println(arr);
      }

      */
      //converting array into arraylist
      String[] arr = {"Java", "Python", "C++"};
//      for(int i=0;i<arr.length;i++){
//          System.out.println(arr[i]);
      List<String> list =  Arrays.asList(arr);
      System.out.println(list);

      }
  }


