import java.util.Scanner;

public class Abcde {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.print("please Enter Number1=");
        int number1 = number.nextInt();

        System.out.print("please Enter Number2=");
        int number2 = number.nextInt();

        if (number1 > number2) {
            System.out.println("Number 1 is greater than Number2");
        } else if (number1 == number2) {
            System.out.println("Both are equal");
        } else {

            System.out.println("Nothing");
        }
        }
    }

