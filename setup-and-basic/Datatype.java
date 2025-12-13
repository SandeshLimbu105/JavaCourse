/* A data type in programming is a classification that tells the computer what kind of data a variable can hold.

It defines:
The size of the data in memory
The type of operations you can perform on it
*/
public class Datatype {
    public static void main(String[] args){
        int number1=24; //integer datatype
        int number2=25; // integer datatype
        int sum =number1+number2;
        System.out.println("The sum is:"  +sum); //add two number
        //System.out.println("\n");
        String first="Sandesh";
        String last="Limbu";
        String fname=first.concat(last);
        System.out.println("Full name is" +fname);


    }
}
