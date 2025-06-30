import java.util.Scanner;

interface person12
{
    void human(String name, int age, String address);
}
public class java8FeaturesExample_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name , address and age");
        String a=sc.nextLine();
        String b=sc.nextLine();
        int c=sc.nextInt();

        person12 obj=(name,age,address) ->
                System.out.println("Person details are: \n Name:"+name+" \nAge: "+age+" \n Address: "+address);
        obj.human(a,c,b);
    }
}
