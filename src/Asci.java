import java.util.Scanner;

public class Asci {
    public static <value4, value2> void main(String[] args) {

        Scanner age = new Scanner(System.in);

        System.out.println("Enter Boy Age=");
        int boyAge = age.nextInt();

        System.out.println("Enter Girl Age=");
        int girlAge = age.nextInt();

        if (boyAge > girlAge) {
            System.out.println("We can continue this");
            Scanner name = new Scanner(System.in);

            System.out.print("Enter Boy Name:");
            String boy = name.next();

            System.out.print("Enter Girl Name:");
            String girl = name.next();

            //firstletter
            char firstLetter = boy.charAt(0);
            int value3 = firstLetter;

            //lastletter
            char lastLetter = girl.charAt(0);
            int value4 = lastLetter;

            if (value3 > value4) {
                System.out.println("Defineatly Marry");
            } else {
                System.out.println("Maybe Married");
            }
        } else if (boyAge == girlAge) {
            System.out.println("Think Twice");
        } else {
            System.out.println("Not Married");

        }

    }
}
