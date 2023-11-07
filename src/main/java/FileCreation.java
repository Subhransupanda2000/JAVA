import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.lang.*;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class FileCreation {

    public static void main(String[] args) throws IOException {
        File Myobj = new File("Myfile.txt");
        if ((Myobj.createNewFile())) {
            System.out.println("file is created : " + Myobj.getName());
        } else {
            System.out.println("file already exist");
        }
        FileWriter fileWriter = new FileWriter("Myfile.txt");
        fileWriter.write("Sucessfully written");
        fileWriter.close();
        System.out.println("sucessfully wrote to the  file");
        Scanner myScanner = new Scanner(Myobj);
        if (myScanner.hasNext()) {
            String data = myScanner.nextLine();
            System.out.println(data);
        }
        if (Myobj.delete()) {
            System.out.println("dltd : " + Myobj.getName());
        }


    }
}
