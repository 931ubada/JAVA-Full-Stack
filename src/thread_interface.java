class AA implements Runnable
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
class BA implements Runnable {
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
public class thread_interface
{
    public static void main(String[] args) throws Exception {
        Runnable obj=new AA();
        Runnable obj1=new BA();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        Thread.sleep(1000);
        t2.start();

    }
}
