class private_modifier
{
  private void private_display()
    {

        int i=10;
        System.out.println("Private no. is "+i);
    }
    public void display()
    {
        private_display();
    }
}
public class access_modifier_PRIVATE {
    public static void main(String[] args) {
        private_modifier obj=new private_modifier();
        obj.display();
    }
}
