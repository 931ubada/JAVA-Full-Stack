import java.util.Scanner;

class person1
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
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}

public class encap
{
    public static void main(String[] args) {
        person1 obj=new person1();
        System.out.println("Old Data:- Name "+obj.getName()+" Age: "+obj.getAge());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and age");
        String a=sc.nextLine();
        int b=sc.nextInt();
        obj.setName(a);
        obj.setAge(b);

        System.out.println("New Data:- Name: "+obj.getName()+" Age: "+obj.getAge());
    }
}
