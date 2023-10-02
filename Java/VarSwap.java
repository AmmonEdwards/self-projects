public class VarSwap {

    public static void main(String[] args){

        String x = "water";
        String y = "Kool-Aid";
        String temp; // curently null

        

        //"sysout Ctrl + space + enter" =  System.out.println();
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        temp = x;
        x=y;
        y=temp;
        System.out.println("New");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        // I don't know why you would need to do this but it is pritty cool you can.


    }
    
}
