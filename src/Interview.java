import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age= sc.nextInt();

        if(age>=18){
            System.out.println("Continue ");

            System.out.print("Enter your name:");
            String name=sc.next();

            System.out.print("married or unmarried:");
            boolean status=sc.nextBoolean();

            char firstLetter = name.charAt(0);
            int ascivalue = firstLetter;

            if(70>ascivalue && status){
                System.out.println("You are Eligible:");
            }
            else{
                System.out.println("You are not Eligible");
            }

        }

        else{
            System.out.println("Not eligible");
        }
    }
}
