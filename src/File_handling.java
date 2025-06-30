import java.io.FileOutputStream;

public class File_handling {
    public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("two.video"))
        {
            System.out.println("Binary file created ");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
