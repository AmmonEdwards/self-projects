import javax.swing.JOptionPane;

public class Choice1 { // Calling this class asks the player if they would like to play the game. 

// Attributes 
   private String choice1;

   Choice1(String name){ // pass in name from man using the fuction in the character class. This is the constuctor. 

        while (true) {
             choice1 = JOptionPane.showInputDialog("Alright " +name+ " Are you ready for an adventure? {Y} or {N} (type 'quit' or hit cancle at anytime to exit the program.)"); // gets a choice from a player calling them by name
            if (choice1.equalsIgnoreCase("y")) { // yes logic
                System.out.println("Great! Let the adventure begin!");
                break;
            } else if (choice1.equalsIgnoreCase("n")) { // no logic
                System.out.println("OK then... Enter Y when you are ready.");
            } else if (choice1.equalsIgnoreCase("quit")) { // quit logic
                System.out.println("Exiting the game. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'Y', 'N', or 'quit'."); // else logic
            }
        }
    }

    public String getChoice1() { // choice getter to be passed down the disition tree.
        return choice1;
    }


}





