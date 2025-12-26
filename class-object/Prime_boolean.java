/*WAP that check a prime number boolean checkPrime(int testNumber)
 */
public class Prime_boolean{
   static boolean checkPrime(int testNumber){
        if(testNumber<=1){
            return false;
        }
        for(int i=2;i<testNumber;i++){
           if(testNumber%i==0) {
           return false;
           }
        }
        return true;
    }
    public static void main(String[] args){
        int n=7;
        if (checkPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}