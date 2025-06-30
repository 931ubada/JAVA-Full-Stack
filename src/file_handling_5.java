import java.nio.file.Files;
import java.nio.file.Paths;

public class file_handling_5 {
    public static void main(String[] args) throws Exception{
        String a="asd.txt";
        String content="hyderabad";
        Files.write(Paths.get(a),content.getBytes());
        System.out.println("success");
    }
}
