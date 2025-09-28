import java.util.Scanner;
public class Cricket {
    public static void main(String[] args) {

        int[] score=new int[11];
        int sum=0;
        int  highScore = score[0];
        for (int i=0; i<11; i++) {

            System.out.print("Enter your score:");
            Scanner sc = new Scanner(System.in);
            score[i] = sc.nextInt();
        }
        for (int i=0; i<11; i++) {
            sum += score[i];
        }

        for (int i=0; i<11; i++) {
            if (score[i] > highScore) {
                highScore = score[i];
            }
        }



        double avarage= sum / 11.00;
        System.out.print("Avrage score="+avarage);
        System.out.print("highest score="+highScore);
    }
}
