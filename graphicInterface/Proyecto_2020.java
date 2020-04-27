package graphicInterface;

import Estructuras_de_datos.MyArrayList;
import businessLogic.Logic;
import data.*;


import java.io.IOException;
import java.util.Scanner;

//no
public class Proyecto_2020 {

    public static final Scanner scanner = new Scanner(System.in);
    private static final Logic logic = new Logic();
    private static MyArrayList<Production> productionList = new MyArrayList<>();

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
                controlPanel();
                break;

            case 2:
                logic.SignUp();
                menumain();
                break;

            case 3:
                System.out.println("***");
                System.out.println("¡Esperamos que vuelva pronto!");
                System.out.println("***");
                System.exit(0);
                break;

            default:
                System.out.println("Valor no valido. Intente de nuevo");
                menumain();
        }

    }


    public static void controlPanel() {
        System.out.println("**********************             PANEL DE CONTROL             **********************");
        System.out.println("                            ***  1.Crear producción     ***");
        System.out.println("                            ***  2.Gestionar producción ***");
        System.out.println("                            ***  3.Crear registro       ***");
        System.out.println("                            ***  4.Cerrar sesión        ***");
        int val = scanner.nextInt();
        switch (val) {
            case 1:
                Production newProduction = new Production();
                productionList.pushBack(newProduction);
            case 2:
                manageMenu();
            case 3:

            case 4:
                menumain();
            default:
                System.out.println("Valor no valido. Intente de nuevo");
                controlPanel();
        }
    }

    public static void manageMenu() {
        System.out.println("Seleccione la producción que desea gestionar:");
        for (int i = 0; i < productionList.getSize(); i++) {
            System.out.print(i + 1 + ". ");
            productionList.getItem(i).printBasicSummary();
        }
        System.out.println();
        System.out.println("0. Regresar al panel de control");
        int selection = scanner.nextInt();
        if (selection < 0 || selection > productionList.getSize()) {
            System.out.println("Selección inválida, por favor intente nuevamente.");
            manageMenu();
        } else if (selection == 0) {
            controlPanel();
        } else {
            int selectedProduction = selection - 1;
            boolean repeatMenu = true;
            while (repeatMenu) {
                if (productionList.getItem(selectedProduction).isActive()) {
                    productionList.getItem(selectedProduction).printBasicSummary();
                    System.out.println("Seleccione que acción desea realizar con esta producción:");
                    System.out.println("1. Ver resumen");
                    System.out.println("2. Completar etapa actual");
                    System.out.println("0. Regresar a la selección de producción");
                    selection = scanner.nextInt();
                    System.out.println(selection);
                    switch (selection) {
                        case 1:
                            productionList.getItem(selectedProduction).printSummary();
                            break;
                        case 2:
                            System.out.println("Case 2");
                            productionList.getItem(selectedProduction).nextStage();
                            if (productionList.getItem(selectedProduction).isFinished()) {
                                repeatMenu = false;
                            }
                            break;
                        case 0:
                            manageMenu();
                        default:
                            System.out.println("Entrada inválida, por favor intente nuevamente.");
                    }
                } else {
                    productionList.getItem(selectedProduction).printBasicSummary();
                    System.out.println("Seleccione que acción desea realizar con esta producción:");
                    System.out.println("1. Iniciar producción");
                    System.out.println("0. Regresar a la selección de producción");
                    selection = scanner.nextInt();
                    System.out.println(selection);
                    switch (selection) {
                        case 1:
                            productionList.getItem(selectedProduction).start();
                        case 0:
                            manageMenu();
                        default:
                            System.out.println("Entrada inválida, por favor intente nuevamente.");
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.print("************");
        System.out.print("Bienvenido al Software de gestión de producción con enfoque en la calidad del producto");
        System.out.println("************\n\n");

        System.out.println("Recuerde que la CALIDAD y EFICIENCIA en su produccion permiten atraer mas clientes.");
        System.out.println("Por ello creamos este software, deje que SOFPROCAL garantice la seguridad y satisfaccion de sus clientes.\n");
        System.out.println("************\n");
        DataBase.loadArchive();
        menumain();
        
         DataBase.WriteArchive();    
         
    }
    
}
