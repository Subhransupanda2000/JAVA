import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.lang.*;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class FileCreation {

    public static void main(String[] args) throws IOException {
        File file = new File("Myfile.txt");
        if ((file.createNewFile())) {
            System.out.println("file is created : " + file.getName());
        } else {
            System.out.println("file already exist");
        }
        FileWriter fileWriter = new FileWriter("Myfile.txt");
        fileWriter.write("Sucessfully written");
        fileWriter.close();
        System.out.println("sucessfully wrote to the  file");
        Scanner myScanner = new Scanner(file);
        if (myScanner.hasNext()) {
            String data = myScanner.nextLine();
            System.out.println(data);
        }
        if (file.delete()) {
            System.out.println("dltd : " + file.getName());
        }
        if (myScanner != null) {
            myScanner.close();


    }
}
}
