import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] departments = new String[5];
        double[][] salaries = new double[5][12];
        double[] averageSalaries = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of the "+(i+1)+" department: ");
            departments[i]=sc.next();
            for (int j = 0; j < 12; j++) {
                System.out.print("Enter "+departments[i]+" employee "+(j+1)+" salary: ");
                salaries[i][j] = sc.nextDouble();
            }
        }
        double totalSalary=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                totalSalary+=salaries[i][j];
            }
            double average = (totalSalary/12);
            averageSalaries[i]=average;
            System.out.println("Average salary for "+departments[i]+" : "+average);
        }
        int index = 0;
        double maxAverage=averageSalaries[0];
        for (int i = 0; i < 5; i++) {
            if (maxAverage<averageSalaries[i]){
                maxAverage=averageSalaries[i];
                i = index;
            }
        }System.out.println("Max average department is : "+departments[index+1]);
    }
}
