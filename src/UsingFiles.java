import java.io.File;
import java.io.IOException;
public class UsingFiles {
    public static void main(String[] args) throws IOException {
        String[] names = {"teja.txt", "rahul.txt", "marks.txt"};

        for (String name : names) {
            File file = new File("student/" + name);
            file.createNewFile();
        }
        File folder = new File("student");

        File[] files = folder.listFiles();

        for (File file : files) {

            System.out.println(file.getName());
            System.out.println(file.length());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            System.out.println("-----");
    }
}}
