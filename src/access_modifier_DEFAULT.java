
class default_modifier{
    void display()
        {
        System.out.println("This is a default modifier");
    }
}
public class access_modifier_DEFAULT {
    public static void main(String[] args) {
        default_modifier obj=new default_modifier();
        protected_modifier obj1=new protected_modifier();  // first create object which u want to
                                                         // access from other class in same package
        obj.display();
        obj1.details();
    }
}
