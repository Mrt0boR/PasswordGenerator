package passwordupdate;
public class Passgen {
   public static String allcharstogether; //this outside of the passgen() method of the passgen class.
                                          // this isso that it is accessible to other files such as the gui class.
    
   public static void characterdeclaration(){

        String lowercaseletters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String symbols = "!@$%^&*()";
        String intagers = "0123456789";

        allcharstogether = lowercaseletters + uppercaseletters + symbols + intagers;

    }
}
