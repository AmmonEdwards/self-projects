import java.util.Scanner;

public class AndOrNotOps {
    
    public static void main(String[] args){


        /*
         * && (And)
         * || (OR)
         * ! (NOT)
         */

        // ---------------------------AND-----------------------
        //  int temp = 19;

        //  if(temp>30){
        //     System.out.println("It is hot outside.");
        //  }
        //  else if(temp>=20 && temp<=30){
        //     System.out.println("it is warm outside.");
        //  }
        //  else{
        //     System.out.println("It is cold outside.");
        //  }


        // -------------------------OR-------------------
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("You are playing a game! Press q or Q to quit");

        // String responce = scanner.next();

        // if(responce.equals("q")||responce.equals("Q")){
        //     System.out.println("You quit the game");

        // }
        // else{
        //     System.out.println("You are still playing the game");
        // }


        // -------------------------NOT-----------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");

        String responce = scanner.next();
        // DE'MORGEN!
        if(!responce.equals("q")&&!responce.equals("Q")){
            System.out.println("You are still playing the game");

        }
        else{
            System.out.println("You quit the game. Goodbye.");
        }




        scanner.close();
    }
    
}
