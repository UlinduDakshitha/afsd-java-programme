import java.util.Scanner;
public class Abcd {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double[] salary=new double[8];
        double[]newSalaries=new double[8];
        double totalOvercost=0;

         for(int i=0; i<8; i++ ){

            System.out.print("Enter your salary:");
            salary[i]=sc.nextDouble();
        }
        for(int i=0; i<8; i++ ) {
            if (salary[i] > 130000) {
                newSalaries[i] = salary[i] + (salary[i] * 0.12);
            } else {
                newSalaries[i] = salary[i];
            }
            totalOvercost += (newSalaries[i] - salary[i]);
        }
        for (int i=0; i<8; i++){

            System.out.println("employee"+(i+1)+newSalaries[i]);
        }
        System.out.println(totalOvercost);
    }
}
