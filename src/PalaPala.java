import java.util.Scanner;

public class PalaPala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail="admin@gmail.com";
        int dbPassword=12345;

        System.out.print("Enter dbEmail:");
        String email=scan.next();

        System.out.print("Enter dbpassword:");
        int password=scan.nextInt();

        if(dbEmail.equals(email) && dbPassword==password){
            System.out.println("Login Succesfull");

            System.out.print("Enter your Name:");
            String name= scan.next();

            System.out.print("Enter your Age:");
            int age=scan.nextInt();

            System.out.print("Enter your lagna:");
            String lagna=scan.next();

            if(age>=18){

                char firstLetter = name.charAt(0);
                int asciValue = firstLetter;
                String lucky;
                if((asciValue%2)!=0){
                     lucky="ඔබ වාසනාවන්තයෙකි!";
                }
            else{
                 lucky="ඔබ අවාසනාවන්තයෙකි!";
                }
                String result ="Lagnaya";
               switch (lagna) {


                   case ("Meesha"):
                       result = "යහපත් ඇසුර සහ යහපත් ආර්ථිකයක්.";
                       break;

                   case ("Wushbha"):
                       result = "අන් අයගේ සිත් දිනා ගනී";
                       break;

                   case (" Mithuna"):
                       result = "සිත නිතර චංචල වී, දුක් සහිත අත්දැකීම්";
                       break;
                   case ("Kataka"):
                       result = "අතමිට සරු වෙන, සමාජයේ සැළකිලි දවසකි.";
                       break;
                   case ("Sinha"):
                       result = "වස්තුව සහ සැප සම්පත් ලඟා වේ";
                       break;
                   case ("Kanaya"):
                       result = "දක්ෂතා මතු වේ, ඉගෙනීමෙන් ඉහළටම";
                       break;
                   case ("Thula"):
                       result = "හිතේ ධෛර්යය ශක්තිය අඩුවිය හැකිය.";
                       break;
                   case ("wushshika"):
                       result = "විවාහය අපේක්ෂකයින් ශුභයි";
                       break;
                   case ("Dhanu"):
                       result = "රහස් සතුරන් සහ හීන වන ශරීර සෞඛ්\u200Dය";
                       break;
                   case ("Makara"):
                       result = "අධ්\u200Dයාපන සහ දරුවන්ගේ කටයුතු සඵලත්වයට";
                       break;
                   case ("Kumbha"):
                       result = "පවුලේ සමගිය සහ සතුට";
                       break;
                   case ("Meena"):
                       result = "ඔබේ දක්ෂතා ක්\u200Dරියාවෙන්ම ඔප්පු කර පෙන්වීමට";
                       break;

                   default:
                       result = "ඔබට ලග්නයක් නැද්ද?";
               }
                {
                   System.out.println(name + " " + lucky + " " + result);

}

            }
            else{
                System.out.println("Age is not enough:");
            }

        }
        else{
            int i;
            for(i=0; i<5; i++){
                System.out.println("Incorrect");
                 int newPassword=scan.nextInt();

                 if(newPassword==dbPassword && dbEmail.equals(email)) {
                     System.out.println("Login Successful");


                     System.out.print("Enter your Name:");
                     String name= scan.next();

                     System.out.print("Enter your Age:");
                     int age=scan.nextInt();

                     System.out.print("Enter your lagna:");
                     String lagna=scan.next();

                     if(age>=18){

                         char firstLetter = name.charAt(0);
                         int asciValue = firstLetter;
                         String lucky;
                         if((asciValue%2)!=0){
                             lucky="ඔබ වාසනාවන්තයෙකි!";
                         }
                         else{
                             lucky="ඔබ අවාසනාවන්තයෙකි!";
                         }
                         String result ="Lagnaya";
                         switch (lagna) {


                             case ("Meesha"):
                                 result = "යහපත් ඇසුර සහ යහපත් ආර්ථිකයක්.";
                                 break;

                             case ("Wushbha"):
                                 result = "අන් අයගේ සිත් දිනා ගනී";
                                 break;

                             case (" Mithuna"):
                                 result = "සිත නිතර චංචල වී, දුක් සහිත අත්දැකීම්";
                                 break;
                             case ("Kataka"):
                                 result = "අතමිට සරු වෙන, සමාජයේ සැළකිලි දවසකි.";
                                 break;
                             case ("Sinha"):
                                 result = "වස්තුව සහ සැප සම්පත් ලඟා වේ";
                                 break;
                             case ("Kanaya"):
                                 result = "දක්ෂතා මතු වේ, ඉගෙනීමෙන් ඉහළටම";
                                 break;
                             case ("Thula"):
                                 result = "හිතේ ධෛර්යය ශක්තිය අඩුවිය හැකිය.";
                                 break;
                             case ("wushshika"):
                                 result = "විවාහය අපේක්ෂකයින් ශුභයි";
                                 break;
                             case ("Dhanu"):
                                 result = "රහස් සතුරන් සහ හීන වන ශරීර සෞඛ්\u200Dය";
                                 break;
                             case ("Makara"):
                                 result = "අධ්\u200Dයාපන සහ දරුවන්ගේ කටයුතු සඵලත්වයට";
                                 break;
                             case ("Kumbha"):
                                 result = "පවුලේ සමගිය සහ සතුට";
                                 break;
                             case ("Meena"):
                                 result = "ඔබේ දක්ෂතා ක්\u200Dරියාවෙන්ම ඔප්පු කර පෙන්වීමට";
                                 break;

                             default:
                                 result = "ඔබට ලග්නයක් නැද්ද?";
                         }
                         {
                             System.out.println(name + " " + lucky + " " + result);

                         }

                     }
                     else{
                         System.out.println("Age is not enough:");
                     }

                 }

                     else{
                         System.out.println("System locked");
                     }
break;
                 }
            }

        }
    }

