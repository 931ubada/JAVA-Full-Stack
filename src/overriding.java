class X {
    void config() {
        System.out.println("Parent Mobile: Samsung");
        System.out.println("RAM: 4GB, Storage: 128GB");
    }
}
class Y extends X {
    void config() {
        System.out.println("My Mobile: OnePlus");
        System.out.println("RAM: 8GB, Storage: 256GB");
    }
}
public class overriding {
    public static void main(String[] args) {
        X obj1 = new X();
        obj1.config();

        Y obj2 = new Y();
        obj2.config();
    }
}
