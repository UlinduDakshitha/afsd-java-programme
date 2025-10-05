import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] holderName = new String[13];
        int[] accountNumber = new int[13];
        double[] amount = new double[13];

        for (int i = 0; i < 13; i++) {

            System.out.print("Enter your name: ");
            holderName[i] = sc.next();

            System.out.print("Enter account number: ");
            accountNumber[i] = sc.nextInt();

            System.out.print("Enter your starting amount: ");
            amount[i] = sc.nextDouble();
        }

        while (true) {
            System.out.println("Enter your account number (or 0 to exit");
            int acc = sc.nextInt();

            int index = 0;
            for (int i = 0; i < 13; i++) {
                if (accountNumber[i] == acc)
                {
                    index = i;
                    break;
                }

            }

            System.out.print("Do you want to deposit or withdraw? ");
            String choose = sc.next();

            switch (choose) {
                case "deposit":
                    System.out.print("Enter your deposit amount: ");
                    double deposit = sc.nextDouble();
                    amount[index] += deposit;
                    System.out.println(" New balance: " + amount[index]);
                    break;

                case "withdraw":
                    System.out.print("Enter your withdraw amount: ");
                    double withdraw = sc.nextDouble();
                    amount[index]-= withdraw;
                    System.out.println(" New balance: " + amount[index]);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        }

    }
}