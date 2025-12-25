


import java.io.FileInputStream;
import java.io.IOException;
public class FileWritter {
    public static void main(String[] args){
        try(FileInputStream input=new FileInputStream("C:\\Users\\Acer\\Desktop\\sandesh limbu\\byteStreamby.txt")){
            int i;
            while ((i = input.read()) != -1){
                System.out.println((char) i);
            }

        }
        catch(IOException e){
            System.out.println("Error reading");
            e.printStackTrace();

        }


    }

}
