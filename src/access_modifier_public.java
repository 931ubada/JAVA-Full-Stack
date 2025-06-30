class public_modifier
{
    public void display()
    {
        System.out.println("this is public");
    }
}
public class access_modifier_public {
    public static void main(String[] args) {
        public_modifier obj=new public_modifier();
        obj.display();
    }
}
