import java.io.FileOutputStream;

public class file_handling_4 {
    public static void main(String[] args) {
        String a = "java.txt";
        String content = ("Hello,How are you !");
        try (FileOutputStream fos=new FileOutputStream(a))
        {
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("successfull");
            fos.close();
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
