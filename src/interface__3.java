class employee
{
    private String empn="vaibhav";
    private int empid=3452;
    private int empsal=75000;
    public void setEmpn(String empn)
    {
        this.empn = empn;
    }
    public void setEmpid(int empid)
    {
        this.empid = empid;
    }
    public void setEmpsal(int empsal)
        {
       this.empsal=empsal;
    }
    public String getEmpn()
    {
        return empn;
    }
    public int getEmpid()
    {
        return empid;
    }
    public int getEmpsal()
    {
        return empsal;
    }
    void display()
    {
        System.out.println(empn+" "+empid+" "+empsal);
    }
}
public class interface__3 {
    public static void main(String[] args) {

        employee obj = new employee();
        System.out.println(obj.getEmpn() + " " + obj.getEmpid() + " " + obj.getEmpsal());
        obj.setEmpn("Ajay");
        obj.setEmpid(2345);
        obj.setEmpsal(80000);
        obj.display();

    }
}