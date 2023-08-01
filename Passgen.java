package passwordupdate;

import java.util.Random;
import java.util.concurrent.Flow;
//////////////////////////////////////////////////////////////////////////////////////////////////////

public class Passgen { 

   String characters = "!@$%^&*()0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

   
    
   public static void passgen(){

       

        for (int i = 0; i < /* numberselection */ ; i++){          //numberselection will be a variable from the gui.java
            
            Random Indexselector = new Random();
            StringBuilder FinalIndexedString = new StringBuilder();
            
            //indexresult uses the Random utility named Indexselector
            public int IndexResult = Indexselector.nextInt(characters.len);
            FinalIndexedString.append(characters.charAt(IndexResult));

        }

        return FinalIndexedString.toString();



    }





    
    
}
