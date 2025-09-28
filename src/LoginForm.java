import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String dbEmail="admin@gamil.com";
        int dbPassword=12345;

        System.out.print("Enter dbEmail:");
        String email=scan.next();

        System.out.print("Enter dbpassword:");
        int password=scan.nextInt();

        if(dbEmail.equals(email) && dbPassword==password){
            System.out.println("Login Succesfull");
        }
        else{
            System.out.println("Login Fail");
        }
    }
}
