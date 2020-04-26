package data;

import Estructuras_de_datos.*;

import java.time.LocalDateTime;
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

    public void start() {
        super.setIsActive(true);
        super.setIsFinished(false);
        System.out.println("Se inició la etapa " + stageNumber + " de producción '" + super.getName() + "'");
        super.setStartDate(LocalDateTime.now());
        System.out.println("Fecha de inicio: " + super.getTimeFormat().format(super.getStartDate()));
    }

    public void setParameters() {
        Scanner input = new Scanner(System.in);
        System.out.println("A continuación, ingrese los valores de los parámetros obtenidos en la etapa:");
        for (int i = 0; i < parameterList.getSize(); i++) {
            System.out.println("Ingrese el valor obtenido para " +
                    parameterList.getItem(i).getName().toLowerCase() + ":");
            parameterList.getItem(i).setValue(input.nextDouble());
        }
        System.out.println("Se han asignado los valores de los parámetros de la etapa " + stageNumber + ".");
    }

    public void finish() {
        boolean testPassed = true;
        int auxIndex = 0;
        for (int i = 0; i < parameterList.getSize() && testPassed; i++) {
            testPassed = parameterList.getItem(i).satisfyQuality();
            auxIndex = i;
        }
        if (!testPassed){
            MyArrayList<Parameter> badParameterList = new MyArrayList<>();
            for (int i = auxIndex; i < parameterList.getSize() ; i++) {
                if (!parameterList.getItem(i).satisfyQuality()){
                    badParameterList.pushBack(parameterList.getItem(i));
                }
            }
            System.out.println("EL proceso no puede continuar ya que no se cumplen los " +
                    "estándares de calidad en los siguientes parámetros:");
            for (int i = 0; i < badParameterList.getSize(); i++) {
                System.out.println(badParameterList.getItem(i).getName());
            }
        } else {
            super.setEndDate(LocalDateTime.now());
            super.setIsActive(false);
            this.setIsFinished(true);
            System.out.println("Finalizó la etapa " + stageNumber + " cumpliendo con los estándares de calidad!");
            System.out.println("Fecha y hora de finalización: " + super.getTimeFormat().format(super.getEndDate()));
        }
    }

    public void printSummary() {
        System.out.println("Nombre: " + super.getName());
        if (super.isActive()) {
            System.out.println("Estado: Activa");
            System.out.println("Fecha y hora de inicio: " + super.getStartDate());
        } else if (super.isFinished()){
            System.out.println("Estado: Finalizada");
            System.out.println("Fecha y hora de inicio: " + super.getStartDate());
            System.out.println("Fecha y hora de finalización: " + super.getEndDate());
            System.out.println("Parámetros de calidad obtenidos:");
            for (int i = 0; i < parameterList.getSize(); i++) {
                System.out.println(parameterList.getItem(i).getName() + ": " + parameterList.getItem(i).getValue());
            }
        } else {
            System.out.println("Estado: Sin iniciar");
        }
        System.out.println("Descripción: " + super.getDescription());
    }

    public int getStageNumber() {
        return stageNumber;
    }

    public MyArrayList<Parameter> getParameterList() {
        return parameterList;
    }
}