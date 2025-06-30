import java.io.FileReader;

public class file_handling_6 {
    public static void main(String[] args) throws Exception {
        String a="image/acd.jpg";
        try(FileReader reader=new FileReader(a))
        {
            int Character;
            while ((Character=reader.read())!= -1)
            {
                System.out.print((byte)Character);   //change byte to char,or anyother format to change o/p
            }                                        // performing explicit casting in line 11
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
