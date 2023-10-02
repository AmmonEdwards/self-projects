import javax.swing.JOptionPane; // DON"T FORGET TO IMPORT! This is the JOptionPane class from the swing libary. 
// GUI = Graphical User Interface
// Major takeaway. The input from the user will allways be a string so if you wan't to use it a diferent way to must convert it using the parse method from the respetive class.
public class GUI {

    public static void main(String[] args){


        // Askes for a name with a pop up box from the user.
        String name = JOptionPane.showInputDialog("Enter your name");

        // Shows the name
        JOptionPane.showMessageDialog(null, "Hello "+name);

        // Asks for the users age and stores it as a int. Inorder to do so we needed to parese the user reqest.
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double hight = Double.parseDouble(JOptionPane.showInputDialog("What is your hight?"));

        JOptionPane.showMessageDialog(null, "You are "+hight+" feet tall");





        
    }
    
}
