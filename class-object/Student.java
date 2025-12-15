
/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
Assign the value of roll_no as '2' and that of name as "John" by
creating an object of the class Student.
*/

public class Student {
    String name;
    int roll_no;
    public void setData(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }
    public String nameDisplay(){
        return name;
    }
    public int roll_noDisplay(){
        return roll_no;
    }
    public static void main(String[] args){
        Student st= new Student();
        st.setData("john",2);
        System.out.println("The name is:"+st.nameDisplay());
        System.out.println("Roll-no is:" +st.roll_noDisplay());
    }
}
