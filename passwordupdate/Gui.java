package passwordupdate;
import java.awt.Color;

import javax.swing.*;
/////////////////////////

public class Gui {
    public static void gui(){
        JFrame passguiframe = new JFrame("Your Generated password");

        JPanel passpanel = new JPanel();
        JLabel total = new JLabel(Passgen.allcharstogether);

        passpanel.add(total);

        passguiframe.getContentPane().add(passpanel);
        passguiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        passguiframe.setBackground(Color.DARK_GRAY);
        passguiframe.setVisible(true);
        passguiframe.setSize(600, 600);




    }
}