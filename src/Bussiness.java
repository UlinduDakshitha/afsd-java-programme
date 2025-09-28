import java.util.Scanner;


public class Bussiness {

    public static void main(String[] args) {

        Scanner salary = new Scanner(System.in);


        System.out.print("value 1:");
        Double bussiness1 = salary.nextDouble();

        System.out.print("value2:");
        Double bussiness2 = salary.nextDouble();

        System.out.print("value3:");
        Double bussiness3 = salary.nextDouble();

        System.out.print("value4:");
        Double bussiness4 = salary.nextDouble();

        double total = bussiness1+bussiness2+bussiness3+bussiness4;

        System.out.println("Average monthly salary =" + (total)/4);

        System.out.println("Total tax value=" + total*13/100);







    }
}
