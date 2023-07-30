
import java.util.Random;
import java.util.concurrent.Flow;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.Font;


public class passgen {
   static String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   static String lowercase = "abcdefghijklmnopqrstuvwxyz";

   static String ints = "0123456789";

   static String syms = "!@$%^&*(){}:<>?;:,./#";

    public static String generatepassword(int passlen) {
        String alltypes = uppercase + lowercase + ints + syms;

        Random randomstringseq = new Random();
        StringBuilder passstring = new StringBuilder();
        for (int i = 0; i < passlen; i++){
            /* the below line utilises the Random() utility. this locates
             * a random index number from the String alltypes - the .length() dictates the index lenth 
             * 0-the total amount of ints, symbolds and alphabets.
              */

            int randomIndex = randomstringseq.nextInt(alltypes.length());
            /*
             * the below line appends the character selected by the randomIndex to the pass string with
             * the stringbuilder() allow the randomly selected strings to be built up.
             */

            passstring.append(alltypes.charAt(randomIndex));
        }
    
        return passstring.toString();//converts the Stringbuilder(ed) passstring to a regular String
    }

    public static void main(String[] args){
        int passlen = 12;
        String FinalPassword = generatepassword(passlen);
        
        JFrame frame = new JFrame("Your Generated Password");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 180, 150));

       
        JLabel passlabel = new JLabel(FinalPassword);
        passlabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(passlabel);


        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        
    //git remote origin test
        
    }
}