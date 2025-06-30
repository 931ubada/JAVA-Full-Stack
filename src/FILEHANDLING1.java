import java.io.File;

public class FILEHANDLING1 {
    public static void main(String[] args) throws Exception{
        String a="klm.xyz";
        File file=new File(a);
        if( file.createNewFile())
            System.out.println("Crearted successfully");
        else
            System.out.println("next time");
    }
}
