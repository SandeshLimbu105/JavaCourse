
public class Enumeration{
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args){
        Level myVar=Level.MEDIUM;
        switch(myVar){
            case LOW :
                System.out.println("low level");
                break;
            case MEDIUM:
                System.out.println("medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;

        }
    }

}
