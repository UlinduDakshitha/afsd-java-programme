import java.util.Scanner;

public class Acpt {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.print("Enter employee salary:");
        double empSalary= scan.nextDouble();

        System.out.print("Enter employee salary:");
        double empSalary2= scan.nextDouble();

        System.out.print("Enter employee salary:");
        double empSalary3= scan.nextDouble();

        System.out.print("Enter employee salary:");
        double empSalary4= scan.nextDouble();

        System.out.println((empSalary+empSalary2+empSalary3+empSalary4)/4);
        System.out.println("finished");
    }
}
