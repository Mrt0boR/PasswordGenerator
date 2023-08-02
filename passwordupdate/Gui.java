package passwordupdate;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/////////////////////////

public class Gui {
    public static void gui() {
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame passguiframe = new JFrame("PassGen");

        JPanel passpanel = new JPanel(new GridBagLayout());
        
        //Label To Request Password in the Box.
        JLabel EnterRequest = new JLabel("Enter Password Length:");
        gbc.gridx = -2;
        gbc.gridy = 0;
        passpanel.add(EnterRequest, gbc);

        //TextField.
        JTextField lengthentry = new JTextField(null,5);
        gbc.gridx = 2;
        gbc.gridy = 0;
        passpanel.add(lengthentry,gbc);
//need to implement the program taking this value and passing it over to the passgen file


        
        //Button to Generate Password.
        JButton generatepassButton = new JButton("Generate New Password");
        gbc.gridx = -2;
        gbc.gridy = -4;

        //Action Listener Button.
        generatepassButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent passwordbuttonpressed){
                Passgen.passgen();
                
                //catch exception make it output a new Jlabel at a position separate to other gbc constraints.
            
            }
        });






        passpanel.add(generatepassButton, gbc);
        passguiframe.getContentPane().add(passpanel);
        passguiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        passguiframe.setBackground(Color.DARK_GRAY);
        passguiframe.setVisible(true);
        passguiframe.setSize(600, 600);




    }
}
