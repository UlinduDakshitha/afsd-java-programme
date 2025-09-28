import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name:");
        String name= sc.next();

        System.out.print("Enter your age:");
        int age=sc.nextInt();

        while(age>100){
            System.out.print("Enter your correct age:");
            age=sc.nextInt();
        }

        System.out.print("Enter your address:");
        String address= sc.next();

        System.out.print("Enter your telephonenumber:");
        int phoneNumber=sc.nextInt();
    }
}
