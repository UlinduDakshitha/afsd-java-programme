import java.util.Scanner;

public class Income {
    public static void main(String[] args) {


        Scanner salary = new Scanner(System.in);

        System.out.print("Enter Income for salary=");
        double salaryIncome = salary.nextDouble();

        System.out.print("Enter Income  for land= ");
        double landIncome = salary.nextDouble();

        System.out.print("Enter Income for Drugs=");
        double drugIncome = salary.nextDouble();

        if (salaryIncome >= 115000) {
            salaryIncome = (salaryIncome - salaryIncome * 14 / 100);
        }

        if (drugIncome > 0) {
            drugIncome = (drugIncome - drugIncome * 50 / 100);
        }

        System.out.println("Final Income=" + "" + salaryIncome + drugIncome + landIncome);

    }
}
