package data;

import Estructuras_de_datos.MyArrayList;


public class RawMaterial {

    private String name;
    private String admissionDate;
    private String expirationDate;
    private String batch;
    private String description;
    private MyArrayList<Parameter> parametrosCalidad;

    
    public RawMaterial() {
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MyArrayList getParametrosCalidad() {
        return parametrosCalidad;
    }

    public void setParametrosCalidad(MyArrayList<Parameter> parametrosCalidad) {
        this.parametrosCalidad = parametrosCalidad;
    }

     public RawMaterial(String name, String admissionDate, String expirationDate, String batch, String description, MyArrayList <Parameter> parametrosCalidad) {
        this.name = name;
        this.admissionDate = admissionDate;
        this.expirationDate = expirationDate;
        this.batch = batch;
        this.description = description;
        this.parametrosCalidad = parametrosCalidad;
    }
     
    @Override
       public String toString(){
        return(name+";"+admissionDate+";"+expirationDate+";"+batch+";"+description);
    }
}
