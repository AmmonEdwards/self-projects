import java.util.Scanner; //Don't FORGET!!! Imports the Scanner class from the java utility package.

public class UserInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // initlize scaner

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // clears the scanner to avoid errors do this after every nextInt call. Commment this out to see the error 
        

        System.out.println("What is your favorit food? ");
        String food = scanner.nextLine();
        

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" Years old");
        System.out.println("You like "+food);

        scanner.close();
    }
    
}
