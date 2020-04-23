package data;

import Estructuras_de_datos.*;

public class ProcessStage extends Event {

    private ArrayList<Parameter> parameterList;

    public ProcessStage(String name, String id, String startDate,
                        String description, ArrayList<Parameter> parameterList) {
        super(name, id, startDate, description);
        this.parameterList = parameterList;
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
            ArrayList<Parameter> badParameterList = new ArrayList<>();
            for (int i = auxIndex; i < parameterList.getSize() ; i++) {
                //testPassed = parameterList.getItem(i).complies();
                //if (!testPassed){
                //    badParameterList.pushBack(parameterList.getItem(i));
                //}
            }
            System.out.println("The process can't continue due to a compliance issue with the parameter(s):");
            //Print the listed parameter's names;
        } else {
            this.isActive = false;
            this.isFinished = true;
        }
    }

}