package businessLogic;

import Estructuras_de_datos.*;
import data.*;
import java.util.*;


public class Logic {
    private static final Scanner scanner = new Scanner(System.in); 
    private static User user = new User(); 
    private static SinglyLinkedList<User> singlyLinkedListUser = new SinglyLinkedList<User>(); 
    
    public void SignUp(){
        try{
            Boolean create=false;
            System.out.print("Escriba por favor, su nombre: ");
            String name=scanner.nextLine();            
            int id=-1;
            while(!create){
             try{
             System.out.print("Escriba por favor, su documento: ");             
             id=scanner.nextInt();
             scanner.nextLine();  
             create=checkSingUp(id,"-1");
             }catch(Exception e){
                  System.out.print("Valor no valido. Intente de nuevo");
             }
            }
            String userr="";
            create=false;
            while(!create){
            System.out.print("Escriba por favor, nombre de usuario: ");
            userr=scanner.nextLine();            
            create=checkSingUp(0,userr);
            }
            
            System.out.print("Escriba por favor, contraseña: ");
            String password=scanner.nextLine();            
            create=false;
            while(!create){
            System.out.print("¿Es usted administrador? Si/No: ");
            String adm=scanner.nextLine();            
            if(adm.equalsIgnoreCase("Si")){
                System.out.print("Digite el codigo de seguridad: ");                
                if(scanner.nextLine().equals("soyadm")){
                     user= new User(name,id,userr,password,true);
                     System.out.println("Usuario administrador creado con exito");
                     create=true;
                }else{
                    System.out.print("Valor no valido.");
                }
            }else if(adm.equalsIgnoreCase("No")){
                user= new User(name,id,userr,password,false);
                 System.out.println("Usuario creado con exito");
                create=true;
            }else{
                System.out.print("Valor no valido.");
                
             }           
            }
            singlyLinkedListUser.pushBack(user);
            
        }catch(Exception e){
            System.out.println("Error al crear usuario: "+e);
        }
    }
    
    public Boolean checkSingUp(int id, String user){
       
        if(user.equals("")){
            System.out.print("El documento no es valido. Intente de nuevo. ");
            return false;
        }  
        for(int i=0; i< singlyLinkedListUser.getSize() && !user.equals("-1"); i++){
            if(singlyLinkedListUser.getItem(i).getUser().equals(user)){
                 System.out.print("El usuario ya existe. Intente de nuevo. ");
                 return false;
            }            
        }
         
        if(id<0){
            System.out.print("El documento no es valido. Intente de nuevo. ");
            return false;
        }        
        for(int i=0; i< singlyLinkedListUser.getSize(); i++){
            if(singlyLinkedListUser.getItem(i).getId()==id){
                 System.out.print("El documento ya existe. Intente de nuevo. ");
                 return false;
            }
        }
        
       
        return true;
         
    }
           
           
}
