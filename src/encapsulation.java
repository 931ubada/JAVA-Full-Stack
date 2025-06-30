class person
{
    private String name="Ajay";
    private int age=18;

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}

public class encapsulation
{
    public static void main(String[] args) {
        person obj=new person();
        System.out.println(obj.getName()+" "+obj.getAge());
    }
}
