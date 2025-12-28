/*Create a function that returns true when both the parameters are equal
else return false. isSameNum(4, 8) ➞ false
*/


public class Equality {
    static boolean isSameNum(int num1, int num2){
        if(num1==num2){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isSameNum(6,8));
    }

}
