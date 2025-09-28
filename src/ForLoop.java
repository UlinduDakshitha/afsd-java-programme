import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        //loops----for loop,while loop,do-while loop
        double totalSalary =0.0;

        //for loop
        for (int i=0; i<500; i++){
            System.out.println("Enter employee salary:");
            totalSalary += scan.nextDouble();

            if(totalSalary>=100000){
                break;
            }
        }
    }
}
