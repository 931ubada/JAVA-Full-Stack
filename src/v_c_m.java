class company{
    String emp_name;
    String role;
    double salary;

    company(String ename,String erole,double esalary)
    {
        emp_name=ename;
        role=erole;
        salary=esalary;
    }
    public void details()
    {
        System.out.println(emp_name+" "+role+" "+salary);
    }
}

public class v_c_m {
    public static void main(String[] args) {
        company obj=new company("Ubada","Developer",75000);
        obj.details();
    }
}
