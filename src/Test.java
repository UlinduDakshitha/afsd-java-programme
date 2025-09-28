import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your name:");
        String name= sc.next();

        System.out.print("Enter your age:");
        int age=sc.nextInt();

        System.out.print("Enter your address:");
         String addres=sc.next();

        if (age>18){
            System.out.print(name);
        }
        else{
            System.out.println(addres);
        }



    }
}
