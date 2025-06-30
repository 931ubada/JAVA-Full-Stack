class student1
{
    private int id=965;
    public String name="Ubada";

    void display_details()
    {
        System.out.println("Name "+name+" "+"   Id "+id);
    }
}

public class std_info {
    public static void main(String[] args) {
        student1 obj=new student1();
        obj.display_details();
    }
}
