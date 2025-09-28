import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];   // array of size 5

        // Taking input
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Printing array elements
        System.out.println("You entered:");
        for(int num : numbers) {
            System.out.println(num);
        }
    }
}

