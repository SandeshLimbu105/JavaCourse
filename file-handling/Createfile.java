
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Createfile {
    public static void main(String[] args) {
        /*
        //create the new file using file class and createNewFile() , getName() method

        try {
            File myfile = new File("C:/Users/Acer/Desktop/java-learning/file-handling/javaTest.txt");
            if(myfile.createNewFile()){
                System.out.println("The file is created:" +myfile.getName());
            }
            else {
                System.out.println("File is already exist");
            }

        }
        catch (IOException e){
            System.out.println("Error is occurs:");
            e.printStackTrace();
        }
        //write the content to the file which is already been created using fileWriter class

        try{
            FileWriter filewrite=new FileWriter("C:/Users/Acer/Desktop/java-learning/file-handling/javaTest.txt");
            filewrite.write("This my first java file handling code");
            filewrite.close();
            System.out.println("File is successfully write");
        }
        catch (IOException e){
            System.out.println("The error is occur");
            e.printStackTrace();
        }



//read the file content that has been already written
        try {
            File fileReader = new File("C:/Users/Acer/Desktop/java-learning/file-handling/javaTest.txt");
            Scanner Reader = new Scanner(fileReader);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }


        } catch (FileNotFoundException e) {
            System.out.println("file not found error");
            e.printStackTrace();

        }

         */
        //delete the file 
            File myfile = new File("C:/Users/Acer/Desktop/java-learning/file-handling/javaTest.txt");
            if(myfile.delete()){
                System.out.println("Delete the file:" +myfile.getName());
            }
            else{
            System.out.println("unable to delete the file");
        }

        }



    }



