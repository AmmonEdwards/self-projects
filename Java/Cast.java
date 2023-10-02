import java.util.Scanner;

// String myString = "1234";
// int foo = Integer.parseInt(myString);
//From stackoverflow
//https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java

public class Cast {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // keep this in the main or it will not work
        System.out.println("What is your age ");
        String age = scanner.nextLine(); // this is a string

        age += 1; // adding one to a string appends a 1 to the end of a string

        System.out.println(age);  

        int age_as_int = Integer.parseInt(age); 

        age_as_int += 1; 

        System.out.println(age_as_int);  

        scanner.close();


        


}
    
}
