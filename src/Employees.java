import java.util.Scanner;

public class Employees {

    public static void main(String[] args) {

        Scanner salary = new Scanner(System.in);

        System.out.print("Employee 1:");
        Double User1 = salary.nextDouble();

        System.out.print("Employee 2:");
        Double User2 = salary.nextDouble();

        System.out.print("Employee 3:");
        Double User3 = salary.nextDouble();

        System.out.print("Employee 4:");
        Double User4 = salary.nextDouble();

        System.out.println("Answer is =" + (User1 + User2 + User3 + User4)/4);
    }

}
