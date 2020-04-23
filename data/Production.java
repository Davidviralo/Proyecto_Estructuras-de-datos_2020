package data;

import Estructuras_de_datos.ArrayList;

public class Production {
    private ArrayList<RawMaterial> rawMaterials;
    private ArrayList<ProcessStage> processStages;
    private String productionID;


    public ArrayList getRawMaterials() {
        return rawMaterials;
    }

    public ArrayList<ProcessStage> getProcessStages() {
        return processStages;
    }

    public String getProductionID() {
        return productionID;
    }

    public void setRawMaterials(ArrayList rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    public void setProcessStages(ArrayList<ProcessStage> processStages) {
        this.processStages = processStages;
    }

    public void setProductionID(String productionID) {
        this.productionID = productionID;
    }
}