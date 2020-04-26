package data;

import Estructuras_de_datos.*;
import java.io.*;

public class DataBase implements Serializable {
    //IMPORTANTE
    //Para poder usar la base de datos deben poner el Users(nombre del usuario en su pc) y el disco local y carpeta donde guardaron el archivo del proyecto
    //Direccion sebastian: C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\Proyecto_Estructuras\\src\\Basededatos.txt
    //Dirección David: C:\\Users\\USUARIO\\Desktop\\Estructuras de Datos\\Proyecto\\src\\Basededatos.txt

    public static SinglyLinkedList<User> singlyLinkedListUser = new SinglyLinkedList<User>();
    private static String localDirection = "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\Proyecto_Estructuras\\src\\Basededatos.txt";

    public static void WriteArchive() {
        FileOutputStream fileStrem = null;
        try {
            fileStrem = new FileOutputStream(localDirection);
            ObjectOutputStream ose = new ObjectOutputStream(fileStrem);

            ose.writeObject(singlyLinkedListUser);

            ose.close();
        } catch (Exception e) {
            System.out.println("Error al guardar datos");
        }
    }

    public static void LoadArchive() {
        FileInputStream fileStremx = null;
        try {
            fileStremx = new FileInputStream(localDirection);
            ObjectInputStream os = new ObjectInputStream(fileStremx);

            Object loadData = os.readObject();
            singlyLinkedListUser = (SinglyLinkedList<User>) loadData;

            os.close();
        } catch (Exception e) {
            System.out.println("Error al cargar archivo");
        }
    }
}
