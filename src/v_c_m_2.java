class car {
    String name;
    String model;
    String color;
    int price;

    car(String cname, String cmodel, String ccolor, int cprices) {
        name = cname;
        model = cmodel;
        color = ccolor;
        price = cprices;
    }

    public void details()
    {
        System.out.println(name + " " + model + " " + color + " " + price);
    }
}
public class v_c_m_2 {
    public static void main(String[] args) {
        car obj = new car("Toyota", "Innova", "white", 1600000);
        car obj2= new car("Mahindra","Scorpio","",2500000);
        obj.details();
        obj2.details();

    }
}

