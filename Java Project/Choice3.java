import javax.swing.JOptionPane;

public class Choice3 {

    private String choice3;

    Choice3(String choice2){ // Passing in choice 2.


        
    // ===================================Left logic======================================
        if(choice2.equalsIgnoreCase("left")){
            while (true) {
        
                choice3 = JOptionPane.showInputDialog("There is a women sitting on the side of the road next to her dead horse. What do you do? Help her 'help', leave her to die 'leave', kill her 'kill'."); // options for the left path

                // option outcomes for the left path
                if (choice3.equalsIgnoreCase("help")) {
                    System.out.println("You helped the women exscape the hautned wood. Yay!!! The End."); 
                    break;
                } else if (choice3.equalsIgnoreCase("leave")) {
                    System.out.println("The women was freakin you out and you left the woods. The End"); 
                    break;
                } else if (choice3.equalsIgnoreCase("kill")) { 
                    System.out.println("You're a monster. The End."); 
                    break;
                }
                else if (choice3.equalsIgnoreCase("quit")) { // quit logic
                    System.out.println("Exiting the game. Goodbye!");
                    break; 
                } else {
                    System.out.println("Invalid choice. Please enter 'help', 'leave', or 'kill'."); // else logic
                }
            }
        }
        // ===================================Right logic======================================
        else if(choice2.equalsIgnoreCase("Right")){ 
            while (true) {
        
                choice3 = JOptionPane.showInputDialog("Down the road is a monster of indisribable horror. It looks at you and runs at you to attack. Do you fight it? 'fight' or do you run? 'run' or do you wan't to try and talk to it 'talk'"); // optiosn for the right path

                // Option outcomes.
                if (choice3.equalsIgnoreCase("fight")) {
                    System.out.println("You hold your ground and fight the monster off. The End"); // In the future I would like to add a battle seqance using the users HP.
                    break;
                } else if (choice3.equalsIgnoreCase("run")) {
                    System.out.println("You ran away. The End."); // Here I would like to add a 50/50 chance of getting a way in the future. 
                    break;
                } else if (choice3.equalsIgnoreCase("talk")) { // Talking to monsters is allmost never a good idea sadly...
                    System.out.println("You tryed to talk the monster out of killing you, sadly it did not go well, you are now dead... The End."); 
                    break;
                }
                else if (choice3.equalsIgnoreCase("quit")) { // quit logic
                    System.out.println("Exiting the game. Goodbye!");
                    break; 
                } else {
                    System.out.println("Invalid choice. Please enter 'fight', 'run', or 'talk'."); // else logic
                }
            }
        }
        else{
            System.out.println("Choice 3 never made; game was quit."); // This is for me to see if the program is operating as I inteded it to. Note:  Does not dispaly of the user hit's the cancle button. Note: I can't get this to display at the moment but still need to have it.
        }

        


    }

    public String getChoice3() { // getter for choice 3 to pass down the program if I add to it in the future.
        return choice3;
    }
    
}

