class protected_modifier
{
    protected void details()
    {
        System.out.println("Hello");
    }
}

public class access_modifier_protected {
    public static void main(String[] args) {
        protected_modifier obj=new protected_modifier();
        obj.details();
    }
}
