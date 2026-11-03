import java.io.*;
public class Writer {
    public static void main(String[] args)throws IOException {
        FileWriter writer=new FileWriter("student/teja.txt");
        writer.write("name : teja\n");
        writer.write("age = 22\n");
        writer.write("course = javaBackend\n ");
        writer.close();
        BufferedReader reader=new BufferedReader(new FileReader("student/teja.txt"));
        String line;
        while((line=reader.readLine())!=null){
        System.out.println(line);}
        reader.close();

    }
}
