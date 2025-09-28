import java.util.Scanner;
public class Telco {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String name1="mobitel";
        String name2="dialog";
        String name3="airtel";


        int mobitel=0;
        int dialog=0;
        int airtel=0;


        String username="abcde";
        int password=12345;

        System.out.print("Enter your username:");
        String enterUsername=sc.next();

        System.out.print("Enter your password:");
        int yourPassword=sc.nextInt();

        if(password==yourPassword &&  username.equals(enterUsername)){
            System.out.print("How many peoples expected today check:");
            int countPeople=sc.nextInt();

            for(int i=0; i<countPeople; i++ ){
                System.out.print("How many sim cards use:");
                int simCards= sc.nextInt();

                for(int j=0; j<simCards ; j++ ){

                    System.out.print("Enter your sim name:");
                    String simName= sc.next();


                        switch (simName){

                            case("mobitel"):
                                mobitel++;
                                break;
                            case("dialog"):
                                dialog++;
                                break;
                            case("airtel"):
                                airtel++;
break;


                        }

                }
            }
            System.out.println(airtel);
            System.out.println(mobitel);
            System.out.println(dialog);

            String maxSim;

            if(airtel>=mobitel && airtel>=dialog){
                 maxSim=name3;
            }
            else if(mobitel>=dialog && mobitel>=airtel){
                 maxSim=name1;
            }
            else{
                 maxSim= name2;
            }

            System.out.println(maxSim);
        }
        else{
            System.out.println( "Login failed!!");
        }
    }
}
