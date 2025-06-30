import java.util.Scanner;

class stud
{
    private String sname="ASDF";
    private String sbranch="CSE";
    private String sroll="CSE345";
    private String saddress="NAGWARA";

    public String getSname()
    {
        return sname;
    }
    public String getSbranch()
    {
        return sbranch;
    }
    public String getSroll()
    {
        return sroll;
    }
    public String getSaddress()
    {
        return saddress;
    }

    public void setSname(String sname)
    {
        this.sname=sname;
    }
    public void setSbranch(String sbranch)
    {
        this.sbranch=sbranch;
    }
    public void setSroll(String sroll)
    {
        this.sroll=sroll;
    }
    public void setSaddress(String saddress)
    {
        this.saddress=saddress;
    }
}

public class encap2 {
    public static void main(String[] args) {
        stud obj=new stud();
        System.out.println("Old Record:");
        System.out.println("Name: "+obj.getSname()+" Branch: "+obj.getSbranch()+" Roll: "+obj.getSroll()+" Address: "+obj.getSaddress());

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter new name");
        String a=sc.nextLine();
        System.out.println("Enter new branch");
        String b=sc.nextLine();
        System.out.println("Enter new roll");
        String c=sc.nextLine();
        System.out.println("Enter new address");
        String d=sc.nextLine();
        obj.setSname(a);
        obj.setSbranch(b);
        obj.setSroll(c);
        obj.setSaddress(d);
        System.out.println("Updated record");
        System.out.println("Name: "+obj.getSname()+" Branch: "+obj.getSbranch()+" Roll: "+obj.getSroll()+" Address: "+obj.getSaddress());


    }
}
