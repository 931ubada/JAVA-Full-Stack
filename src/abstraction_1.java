abstract class tata
{
    abstract void employee();
    abstract void department();
}
class TataStrive123 extends tata
{
    /* String name,salary;
    String dept_name,id;

    TataStrive(String name,String dept_name,String salary,String id)
    {
        this.id=id;
        this.dept_name=dept_name;
        this.name=name;
        this.salary=salary;
    }*/
    void employee()
    {
        System.out.println(" Ajay Salary 500000");
    }

    void department()
    {
        System.out.println("Java Dept  id 4889");
    }

}

public class abstraction_1
{
    public static void main(String[] args)
    {
        TataStrive123 obj=new TataStrive123();
        obj.employee();
        obj.department();

    }
}
