

public class SwitchStatments {

    public static void main(String[] args){

        String day = "Pizza";

        switch(day){

            case "Sunday": System.out.println("It is Sunday");
            break;

            case "Monday": System.out.println("It is Monday");
            break;

            case "Tusday": System.out.println("It is Tusday");
            break;

            case "Wednesday": System.out.println("It is Wednesday");
            break;

            case "Thrusday": System.out.println("It is Thrusday");
            break;

            case "Friday": System.out.println("It is Friday");
            break;

            case "Saterday": System.out.println("It is Saterday");
            break; // must have breaks

            default: System.out.println("That is not a day"); // if the case is not met this line is exsidcuted.
            

        }
        
    }
    
}
