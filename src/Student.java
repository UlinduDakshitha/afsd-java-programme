import java.util.Scanner;
public class Student {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String[] subjectName=new String[9];
        int[] marks=new int[9];

        for(int i=0; i<9; i++ ){

            System.out.print("Enter Subject Name:");
              subjectName[i]=sc.next();
        }

        for(int i=0; i<9; i++){
            System.out.print("Enter Subject Mark:");
            marks[i]=sc.nextInt();
        }
        int maxMark = marks[0];
        String maxSubject = subjectName[0];
        int sum=0;

        for (int i = 0; i < 9; i++) {
            sum += marks[i];
            if (marks[i] > maxMark) {
                maxMark = marks[i];
                maxSubject = subjectName[i];
            }
        }

        double average = sum / 9.0;

        System.out.println( "max mark in subject:"+maxSubject);
        System.out.println("Average mark: " + average);
    }
}





