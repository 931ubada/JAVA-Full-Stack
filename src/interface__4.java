interface uni
{
    void Btech(String name,String yr,float percentage);
    void PU(String name,String yr,float percentage);
    void school(String name,String yr,float percentage);
}
class college2 implements uni
{
    String bname;
    String byr;
    float bpercentage;

    public void Btech(String name, String yr, float percentage) {
        this.bname=name;
        this.byr=yr;
        this.bpercentage=percentage;
    }
    public void display()
    {
        System.out.println(bname+" "+byr+" "+bpercentage);
    }
    String pname,pyr;
    float ppercentage;

    public void PU(String name, String yr, float percentage) {
        this.pname=name;
        this.pyr=yr;
        this.ppercentage=percentage;
    }
    public void display1()
    {
        System.out.println(pname+" "+pyr+" "+ppercentage);
    }
    String sname,syr;
    float spercentage;

    public void school(String name, String yr, float percentage) {
        this.sname=name;
        this.syr=yr;
        this.spercentage=percentage;
    }
    public void display2()
    {
        System.out.println(sname+" "+syr+" "+spercentage);
    }
}

public class interface__4 {
    public static void main(String[] args) {
        college2 obj=new college2();
        obj.Btech("VVIT","2025",82.5f);
        obj.PU("REVA","2021",92);
        obj.school("SBPS","2019",81.7f);
        obj.display();
        obj.display1();
        obj.display2();

    }
}
