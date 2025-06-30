class sfd
{
    String name;
    int age;
    sfd(String n,int a)
    {
        name=n;
        age=a;
    }
    public void details()
    {
        System.out.println(name+" "+age);
    }
}
public class variable_constructor_method {
    public static void main(String[] args) {
        sfd obj=new sfd("ajay",19);
        obj.details();

    }
}
