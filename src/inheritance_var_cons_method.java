class car1
{
    String color;
    String model;

    car1(String colo,String mdl)
    {
        color=colo;
        model=mdl;
    }
    void detail()
    {
        System.out.println(color+" "+model);
    }
    void xyz() {
        System.out.println(color);
    }
}
class bmw extends car1
{
    String fuel;
    int price;
    String name;

    bmw(String colo,String mdl,String ful,int pric,String nm) {

        super(colo,mdl);

        fuel = ful;
        price = pric;
        name = nm;

    }
    void detail1()
    {
        System.out.println(name+" "+fuel+" "+price);
    }
}

public class inheritance_var_cons_method
{
    public static void main(String[] args) {
        car1 obj=new car1("white","AMG2025");
        bmw obj1=new bmw("Black","AFG2024","Petrol",7500000,"X7");
        obj.detail();
        obj1.detail1();
        obj.xyz();
        obj1.xyz();
    }
}
