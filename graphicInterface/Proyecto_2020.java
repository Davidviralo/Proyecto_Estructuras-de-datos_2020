package graphicInterface;

import businessLogic.Logic;

public class Proyecto_2020 {
    
    private static final Logic logic = new Logic(); 
    public static void main(String[] args) {
            
           for(int i=0; i<3; i++){
               logic.SignUp();
           }
            
    }
}
