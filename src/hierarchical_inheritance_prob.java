import java.util.Scanner;

class fruit
{
    String season;
    String region;

    fruit(String season,String region)
    {
        this.season=season;
        this.region=region;
    }
    void details()
    {
        System.out.println(season+" "+region);
    }
}
class apple extends fruit
{
    String color;
    String price;

    apple(String season,String region,String color,String price)
    {
        super(season,region);
        this.color=color;
        this.price=price;
    }

    void details()
    {
        super.details();
        System.out.println(color+" "+price);
    }

}
class mango extends fruit
{
    double price;
    mango(String season,String region,double price)
    {
        super(season,region);
        this.price=price;
    }
    void details()
    {
        super.details();
        System.out.println(price+" ");
    }
}

public class hierarchical_inheritance_prob
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the season,region,color and price for apple");
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        String d=sc.nextLine();
        apple obj=new apple(a,b,c,d);
        mango obj1=new mango("summer","Uttar Pradesh",300);
        obj.details();
        obj1.details();
    }
}
