import java.io.File;
import java.io.IOException;

public class Filehandling {

    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        File folder=new File("student");
        if(folder.mkdir()){
        System.out.println("folder created");}
        else{
            System.out.println("folder already exsits");
        }

        System.out.println(file.exists());

        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
    }
}