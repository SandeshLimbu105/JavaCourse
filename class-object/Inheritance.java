


public class Inheritance {
    protected String s_name="Aadarsh";

    public void S_display(){
        System.out.println("School name:" +s_name);

    }
   public static class  Student extends Inheritance{
        String stname="Sandesh";
        void display(){
            System.out.println("The name:" +stname);
           // S_display();
        }
    }
    public static void main(String[] args){
        Student ob=new Student();
        ob.S_display();
        ob.display();

    }
}
