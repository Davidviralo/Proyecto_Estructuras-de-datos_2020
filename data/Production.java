package data;

import Estructuras_de_datos.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Production extends Event{
    private MyArrayList<RawMaterial> rawMaterials;
    private MyArrayList<Stage> stages;

    public Production(String name, String description, MyArrayList<RawMaterial> rawMaterials,
                      MyArrayList<Stage> stages) {
        super(name, description);
        this.rawMaterials = rawMaterials;
        this.stages = stages;
    }

    public Production() {
        Scanner input = new Scanner(System.in);
        System.out.println("**********************  ASISTENTE DE CREACIÓN DE PRODUCCIÓN  ***********************");
        System.out.println("Bienvenido, aquí podrá crear su producción. Para ello puede seleccionar las materias " +
                "primas que desee usar y puede dividir su producción en etapas con sus respectivos parámetros de " +
                "calidad. A continuación, siga las instrucciones dadas");
        System.out.println("Ingrese el nombre de la producción:");
        String name = input.nextLine();
        System.out.println("Nombre: " + name);
        System.out.println("Ingrese una descripción para la producción:");
        String description = input.nextLine();
        System.out.println("Descripción: " + description);
        System.out.println("Seleccione las materias primas que va a emplear.");
        //rawMaterials selection.
        System.out.println("Cree etapas de producción:");
        MyArrayList<Stage> processStages = new MyArrayList<>();
        Stage stage = new Stage(1);
        processStages.pushBack(stage);
        boolean createStage = true;
        while (createStage) {
            System.out.println("¿Desea agregar más etapas al proceso?");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("Si")) {
                stage = new Stage(processStages.getSize()+1);
                processStages.pushBack(stage);
            }else if (answer.equalsIgnoreCase("No")){
                System.out.println("Creación de etapas finalizadas.");
                createStage = false;
            }else{
                System.out.println("Entrada no válida. Intente de nuevo.");
            }
        }
        super.setName(name);
        super.setDescription(description);
        this.stages = processStages;
        System.out.println("Se creó la producción '" + name + "' con " + processStages.getSize() + " etapas.");
    }

    public void start() {
        super.setIsActive(true);
        super.setIsFinished(false);
        System.out.println("Se inició la producción '" + super.getName() + "'");
        LocalDateTime now = LocalDateTime.now();
        super.setStartDate(now);
        System.out.println("Fecha de inicio: " + super.getTimeFormat().format(now));
    }

    public void  finish() {
        boolean allStagesFinished = true;
        for (int i = 0; i < stages.getSize() && allStagesFinished; i++) {
            allStagesFinished = stages.getItem(i).isFinished();
        }
        if (allStagesFinished) {
            System.out.println("¡Felicitaciones! Se ha finalizado" +
                    " el proceso cumpliendo todos los parámetros de calidad.");
            System.out.println("¡Los clientes estarán muy satisfechos con su producto!");
        } else {
            System.out.println("Hay etapas que no se han finalizado, " +
                    "por favor revíselas antes de intentar finalizar la producción nuevamente.");
        }
    }

    public MyArrayList<RawMaterial> getRawMaterials() {
        return rawMaterials;
    }

    public MyArrayList<Stage> getStages() {
        return stages;
    }

    public void setRawMaterials(MyArrayList<RawMaterial> rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    public void setStages(MyArrayList<Stage> stages) {
        this.stages = stages;
    }
}