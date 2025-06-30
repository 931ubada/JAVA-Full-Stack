class animal
{
    String color;
    String type;

    animal(String type,String color)
    {
        this.color=color;
        this.type=type;
    }
    void details1()
    {
        System.out.println(color+" "+type);
    }
}
class dog extends animal
{
    String n;
    dog(String color,String type,String n)
    {
        super(color,type);
        this.n=n;
    }
    void details2()
    {
        System.out.println(n+" "+color+" "+type);
    }
}
class baby_dog extends dog
{
    String breed;
    baby_dog(String color,String type,String n,String breed)
    {
        super(color,type,n);
        this.breed=breed;
    }
    void details()
    {
        System.out.println(n+" "+color+" "+type+" "+breed);
    }
}

public class multilevel_inheritance_ex {
    public static void main(String[] args) {


        baby_dog obj = new baby_dog("grey", "carnivore", "Dogesh", "German shepherd");
        obj.details();
        obj.details1();
        obj.details2();
    }
}
