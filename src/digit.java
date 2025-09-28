import java.util.Scanner;

public class digit {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number:");
        int number=sc.nextInt();

        while(number>0){

            System.out.println( number%10);
            number=number/10;
        }

    }
}
