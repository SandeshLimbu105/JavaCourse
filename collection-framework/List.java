


import java.util.ArrayList;
public class List {
    public static void main(String[] args){
        //Arraylist is a class which is used to implement list interface in java
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Sandesh"); // add method is used to add the item in list
        arrayList.add("Ram");
        arrayList.add("Sita");
        arrayList.add("Ramesh");
        arrayList.add("Shanti");
        arrayList.add("Bibek ");
        arrayList.set(3,"Rita"); // set method is used to modify the content in particular index
        System.out.println("name:"+arrayList.get(3));
        System.out.println("Total no of elements:" +arrayList.size()); // the size method helps to determine the size of the list
        // for each loop is looping techniques
        for(String arr:arrayList){
            System.out.println("The name of all person in list:" +arr);
        }

    }

}
