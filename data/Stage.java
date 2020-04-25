package data;

import Estructuras_de_datos.*;

import java.util.Scanner;

public class Stage extends Event {

    private int stageNumber;
    private MyArrayList<Parameter> parameterList;

    public Stage(String name, String id, String startDate,
                 String description, MyArrayList<Parameter> parameterList) {
        super(name, description);
        this.parameterList = parameterList;
    }

    public Stage(int stageNumber) {
        this.stageNumber = stageNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la etapa " + stageNumber + ":");
        String name = input.nextLine();
        super.setName(name);
        System.out.println("Nombre de la etapa: " + name);
        System.out.println("Ingrese la descripción de la etapa " + stageNumber + ":");
        String description = input.nextLine();
        super.setDescription(description);
        System.out.println("Descripción de la etapa: " + description);
        System.out.println("Cree parámetros de calidad a evaluar en esta etapa:");
        MyArrayList<Parameter> parameterList = new MyArrayList<>();
        Parameter parameter = new Parameter();
        parameterList.pushBack(parameter);
        boolean createParameter = true;
        while (createParameter) {
            System.out.println("¿Desea agregar más parámetros a la etapa?");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("Si")){
                parameter = new Parameter();
                parameterList.pushBack(parameter);
            }else if (answer.equalsIgnoreCase("No")){
                System.out.println("Creación de etapas finalizadas.");
                createParameter = false;
            }else{
                System.out.println("Entrada no válida. Intente de nuevo.");
            }
        }
        System.out.println("Se creó la etapa " + stageNumber + " con "
                + parameterList.getSize() + " parámetros de calidad.");
    }

    public void finish() {
        boolean testPassed = true;
        int auxIndex = 0;
        for (int i = 0; i < parameterList.getSize() && testPassed; i++) {
            //Checks all the parameters in the list.
            //test passed = parameterList.getItem(i).complies();
            auxIndex = i;
        }
        //If a parameter does not comply with the given quality standart,
        //it is listed in badParametersList
        if (!testPassed){
            MyArrayList<Parameter> badParameterList = new MyArrayList<>();
            for (int i = auxIndex; i < parameterList.getSize() ; i++) {
                //testPassed = parameterList.getItem(i).complies();
                //if (!testPassed){
                //    badParameterList.pushBack(parameterList.getItem(i));
                //}
            }
            System.out.println("The process can't continue due to a compliance issue with the parameter(s):");
            //Print the listed parameter's names;
        } else {
            super.setIsActive(false);
            this.setIsFinished(true);
        }
    }

    public int getStageNumber() {
        return stageNumber;
    }

    public MyArrayList<Parameter> getParameterList() {
        return parameterList;
    }
}