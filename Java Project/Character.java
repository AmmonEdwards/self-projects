import javax.swing.JOptionPane;

public class Character {

    //Attributes
    private String name;
    private int hp;

    

    Character(){ // constructor
    // GUI asks for name
    this.name = JOptionPane.showInputDialog("Enter your name");
    // GUI ask for HP must parse string to int
    this.hp = Integer.parseInt(JOptionPane.showInputDialog("How much hp do you have?"));
    // Shows the name and preset HP
    JOptionPane.showMessageDialog(null, "Hello "+name+" You have "+hp+" Hit Points.");
}

// Getters
// Method to get the name
public String getName() {
    return name;
}
// Method to get the hp value
public int getHP(){
    return hp;
}

}
