import java.util.Scanner;


public class ArithmeticExpressions {

    Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args){

    // operators

    // addition
    int friends = 10;
    friends += 1; //friends = friends +1;
    System.out.println(friends); // 11

    // subtraction
    int pies = 5;
    pies -= 1; // pies = pies -1;
    System.out.println(pies); // 4

    // increment 
    int cats = 20;
    cats++;
    System.out.println(cats);

    // Decrement
    int dogs = 3;
    dogs--;
    System.out.println(dogs);
    
    // devition

    double money = 10; // if not a double the remander will be droped as it will only display a int

    money /= 3;

    System.out.println(money);

    // Get a remander after devition

    int x = 5; // if not a double the remander will be droped as it will only display a int

    x %= 2;

    System.out.println(x);

    
       
    




    }
    
}
