import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
         double totalTax=0.0;

        for (int i=0; i<12; i++){
            System.out.print("Enter employee salary:");
           double salary = scan.nextDouble();

            if(salary>130000){
                totalTax=salary*14/100;
            }




            }
        System.out.println("Totaltax" +totalTax);
        }
    }





