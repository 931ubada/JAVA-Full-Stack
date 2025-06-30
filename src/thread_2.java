class red extends Thread
{
    public void run()
    {
        System.out.println("STOP");
    }
}

class yellow extends  Thread
{
    public void run()
    {
        System.out.println("Slow");
    }
}

class green extends  Thread
{
    public void run()
    {
        System.out.println("GO");
    }
}
public class thread_2 {
    public static void main(String[] args) throws Exception{
        red a=new red();
        yellow b=new yellow();
        green c=new green();
        c.start();
        Thread.sleep(6000);
        b.start();
        Thread.sleep(3000);
        a.start();

    }
}
