class AAA implements Runnable
{
    public void run()
    {
        for (int i=0;i<=50;i=i+10)
        {
            System.out.println(i+" %");
            try{Thread.sleep(1000);}
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

public class thread_interface_2 {
    public static void main(String[] args) throws Exception{
        Runnable obj = new AAA();
        Thread t=new Thread(obj);
        t.start();
        Thread.sleep(3000);
    }
}
