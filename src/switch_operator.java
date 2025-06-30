import java.util.Scanner;

public class switch_operator {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter week day no.");
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("sunday");
            case 2:
                System.out.println("monday");
            case 3:
                System.out.println("tuesday");
            case 4:
                System.out.println("wednesday");
            case 5:
                System.out.println("thursday");
            case 6:
                System.out.println("friday");
            case 7:
                System.out.println("saturday");
            default:
                System.out.println("bhai no.daal na hai");*/

    // Grade program

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int mark=sc.nextInt();
        //int grade=sc.nextInt();
        int grade = mark / 10;
        switch(grade)
        {
            case 10:
                System.out.println("A+");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B+");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 5:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
            case 3:
                System.out.println("F");
                break;
            default:
                System.out.println("Bhai tu last se 1st hai");
        }
    }
}
