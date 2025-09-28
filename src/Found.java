import java.util.Scanner;

public class Found {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name:");
        String name= sc.next();

        System.out.print("Enter your age:");
        int age= sc.nextInt();

        char firstLetter = name.charAt(0);
        int myAsci = firstLetter;

        for(int i=0; i<10; i++){
            System.out.print("Enter girl name:");
            String girlName=sc.next();

            System.out.print("Enter girl age:");
            int girlAge= sc.nextInt();

            char letter = girlName.charAt(0);
            int girlAsci= letter;

            if (myAsci>girlAsci && age>girlAge){

                System.out.println("matched");
                break;
            }
            else{
                System.out.println("not matched");

            }

        }
    }
}
