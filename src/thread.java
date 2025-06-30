class AB extends Thread
{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("JAVA");
            try{Thread.sleep(1000);}
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class BB extends Thread {
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("REACT");
            try{Thread.sleep(1000);}
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class thread
{
    public static void main(String[] args) throws Exception {
        AB obj=new AB();
        BB obj1=new BB();
        obj.start();
        Thread.sleep(1000);
        obj1.start();

    }
}
