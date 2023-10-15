public class Main {

    public static void main(String[] args){

        Character player1 = new Character(); // makes a new player
        Choice1 Choice1 = new Choice1(player1.getName()); // asks the player by name if they would like to play the game
        Choice2 Choice2 = new Choice2(Choice1.getChoice1()); // asks the player what they wouuld like to do after choosing to play the game
        Choice3 Choice3L = new Choice3(Choice2.getChoice2()); // asks the player what to do after going down the right or left path.
        
    }

    
}
