import java.io.File;
import java.io.FileWriter;

public class file_handling_3 {
    public static void main(String[] args) throws Exception {
        String a="asd.txt";
        File file=new File(a);
        FileWriter ab=new FileWriter(file);
        ab.write("Hello");
        ab.close();
        System.out.println("File created");
    }
}
