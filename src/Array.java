import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        int age=5;//single
        System.out.println(age);

        int[] ages=new int[8];


        for(int i=0; i<=8; i++ ){

            System.out.print("Enter age:");
                Scanner sc=new Scanner(System.in);
                 ages[i]= sc.nextInt();
            //System.out.println(ages[i]);

        }


    }
}
