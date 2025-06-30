import java.nio.file.Files;
import java.nio.file.Paths;

public class file_handling_2 {
    public static void main(String[] args) {
        String a="java.txt";
        try{
            Files.write(Paths.get(a),"Hello def".getBytes());
            System.out.println("File created successfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
