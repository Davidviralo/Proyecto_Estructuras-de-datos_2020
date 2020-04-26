package graphicInterface;

import businessLogic.Logic;
import data.*;

import static data.DataBase.singlyLinkedRawMaterial;

import java.io.IOException;
import java.util.Scanner;

//no
public class Proyecto_2020 {

    public static final Scanner scanner = new Scanner(System.in);
    private static final Logic logic = new Logic();

    static void menumain() {
        System.out.println("**********************             MENU PRINCIPAL             **********************");
        System.out.println("                              ***1.Iniciar Sesion ***");
        System.out.println("                              ***2.Registrarse    ***");
        System.out.println("                              ***3.Cerrar programa***");
        System.out.print("\nSeleccione una de las opciones: ");
        int val = scanner.nextInt();
        scanner.nextLine();
        boolean check;
        switch (val) {
            case 1:
                check = logic.CheckSignIn();
                while (!check) {
                    System.out.print("¿Desea volver al menu principal?Si/No: ");
                    String back = scanner.nextLine();
                    if (back.equalsIgnoreCase("Si")) {
                        menumain();
                        check = true;
                    } else if (back.equalsIgnoreCase("No")) {
                        check = logic.CheckSignIn();
                    } else {
                        System.out.print("Valor no valido. Intente de nuevo.");
                    }
                }

            case 2:
                logic.SignUp();
                menumain();

            case 3:
                System.out.println("***");
                System.out.println("¡Esperamos que vuelva pronto!");
                System.out.println("***");
                System.exit(0);

            default:
                System.out.println("Valor no valido. Intente de nuevo");
        }

    }


    public void manageMenu() {

    }


    public static void main(String[] args) throws IOException {

        System.out.print("************");
        System.out.print("Bienvenido al Software de gestión de producción con enfoque en la calidad del producto");
        System.out.println("************\n\n");

        System.out.println("Recuerde que la CALIDAD y EFICIENCIA en su produccion permiten atraer mas clientes.");
        System.out.println("Por ello creamos este software, deje que SOFPROCAL garantice la seguridad y satisfaccion de sus clientes.\n");
        System.out.println("************\n");

        DataBase.LoadArchive();

        menumain();

        //DataBase.reachMaterial("5067");


        //System.out.println(singlyLinkedRawMaterial.getFront().toString());
        //Esta funcion le permite buscar el materia que usted desee.
        //Cuando lo encuentre lo va a guardar en su respectiva lista(En este caso es de materiales pues en la lista de materiales

        //DataBase.WriteArchive();
    }
}
