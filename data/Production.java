package data;

import Estructuras_de_datos.*;

public class Production extends Event{
    private ArrayList<RawMaterial> rawMaterials;
    private ArrayQueue<ProcessStage> processStages;

    public Production(String name, String id, String startDate, String description,
                      ArrayList<RawMaterial> rawMaterials, ArrayQueue<ProcessStage> processStages) {
        super(name, startDate, id, description);
        this.rawMaterials = rawMaterials;
        this.processStages = processStages;
    }

    public ArrayList<RawMaterial> getRawMaterials() {
        return rawMaterials;
    }

    public ArrayQueue<ProcessStage> getProcessStages() {
        return processStages;
    }

    public void setRawMaterials(ArrayList<RawMaterial> rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    public void setProcessStages(ArrayQueue<ProcessStage> processStages) {
        this.processStages = processStages;
    }
}