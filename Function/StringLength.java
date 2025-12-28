
/*Write a java program to count all the words of a string .
 Example : I want to be a software engineer. Output : 7
 */

public class StringLength {
    public static void main(String[] args){
        String string="Hello , it's me Sandesh";
        /*here trim method remove the space after before the string and \\s identifies
        where is white space and + represent one or more white space then split is used
        to separate word that has been specified by the \\s, finally length property of
        array is used to count the number of string elements.
         */
        String[] words=string.trim().split("\\s+");
        // in below the length is just property of an array rather than method
        System.out.println("The number of string:"+words.length);
    }
}
