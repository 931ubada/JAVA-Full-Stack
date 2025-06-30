import java.io.File;

public class file_handling_8 {
    public static void main(String[] args) {
        File file=new File("klm.xyz");
        if(file.exists())
        {
            if(file.delete())
            {
                System.out.println("file deleted");
            }
            else {
                System.out.println("error in deleting");
            }
        }
        else {
            System.out.println("not exist");
        }
    }
}
