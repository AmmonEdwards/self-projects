import java.util.Random;

public class RandNum {

    public static void main(String[] args){

        // Sudo Random
        Random random = new Random(); 

        // range: -2E10_2E10
        int x = random.nextInt(); 
        System.out.println(x);

        // range: 6(0-5)
        int y = random.nextInt(6); 
        System.out.println(y);

        // range: 6(1-6) as we are adding a 1. This is our six sided die! Well sudo six sided die.
        int z = random.nextInt(6)+1; 
        System.out.println(z);

        // Floating point num.
        double d = random.nextDouble();
        System.out.println(d); 


        // coin flip. (More or less)
        boolean b = random.nextBoolean();
        System.out.println(b); 





    }
    
}
