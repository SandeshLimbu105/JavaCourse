/*
WAP to check whether a number is even or odd using function.
 The function name should be isEven(int parameter), which
 returns true if the number is even and return false if the number is  odd.

*/
public class Even_odd {
    private int num;
    boolean isEven(int num){
        if(num%2==0){
            return (true);
        }
        else {
            return (false);
        }
    }
    public static void main(String[] args){
        Even_odd ob=new Even_odd();
        boolean result=ob.isEven(6);
        if(result){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
