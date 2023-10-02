import javax.swing.JOptionPane;

public class Choice2 {

    private String choice2; // stores the player choice to be passed down to other porgrams.

    Choice2(String choice1){ // pass in name from man using the fuction in the character class.


        if(choice1.equalsIgnoreCase("y")){ // if the player wan'ted to play the game this code is exsicuted. 
            while (true) {
        
                choice2 = JOptionPane.showInputDialog(" You wake up at a fork on a dark and dreary road. Do you go Left, or right?"); // Text for the next part of the story.

                if (choice2.equalsIgnoreCase("left")) { // left path logic
                    System.out.println("At the fork, You head down the left path"); 
                    break;
                } else if (choice2.equalsIgnoreCase("right")) { // right path logic
                    System.out.println("At the fork, You head down the right path"); 
                    break;
                } else if (choice2.equalsIgnoreCase("quit")) { // exit logic
                    System.out.println("Exiting the game. Goodbye!");
                    break; 
                } else {
                    System.out.println("Invalid choice. Please enter 'left', 'right', or 'quit'."); // else logic
                }
            }
        }
        else{
            System.out.println("Choice 2 never made; game was quit."); // This is for me to see if the program is operating as I inteded it to.  Does not dispaly of the user hit's the cancle button 
        }



    }

    public String getChoice2() { // getter for choice2 to be passed down the program.
        return choice2;
    }
    
}
