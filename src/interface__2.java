interface animal1
{
    public void dog(String name,String breed,String color);
    public void cat(String name,String color);
}
class animal3 implements animal1
{
    public void dog(String name,String breed,String color)
    {
        System.out.println(name+" "+breed+" "+color);
    }

    public void cat(String name,String color)
    {
        System.out.println(name+" "+color);
    }
}



public class interface__2 {
    public static void main(String[] args) {
        animal3 obj=new animal3();
        obj.dog("def","fdfw","fwefewf");

    }
}
