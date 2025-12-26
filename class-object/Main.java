public class Main extends Thread{
    public static void main(String[] args){
        Main ob=new Main();
        ob.start();
        System.out.println("This is class outside thread");
    }
    public void run(){
        System.out.println("This is class inside thread");
    }

}
