package data;

import Estructuras_de_datos.ArrayQueue;
import Estructuras_de_datos.MyArrayList;
import java.util.Scanner;

public class Parameter {
    private String name;
    private double value;
    private double lowerLimit;
    private double upperLimit;

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public double getLowerLimit() {
        return lowerLimit;
    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setLowerLimit(double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public void setUpperLimit(double upperLimit) {
        this.upperLimit = upperLimit;
    }
public Parameter(){
        Scanner input = new Scanner(System.in);
       /* int numeroetapas= teclado.nextInt();
        System.out.println("Porfavor ingrese el numero de etapas");
        for (int i=0;i<numeroetapas;i++){
         System.out.println("Etapa. nombre,id,starDate,description");
            String nameStage = teclado.nextLine();
            int id = teclado.nextInt();
            String StartDate = teclado.nextLine();
            String descrption = teclado.nextLine();
            MyArrayList<Parameter> parameters = new MyArrayList<>();
            ProcessStage etapa1 = new ProcessStage("", "StartDate", "StartDate", "descrption",parameters); 
            ArrayQueue<ProcessStage> listaProcesos = new ArrayQueue<>();
        this();*/
            System.out.println("Creación de parametro");
            System.out.println("Digite el valor");
            this.value= input.nextDouble();
            System.out.println("Digite limite inferior");
            this.lowerLimit= input.nextDouble();
            System.out.println("Digite limite superior");
            this.upperLimit= input.nextDouble();
            System.out.println("Digite el nombre");
            this.name = input.next();
        
    }
    public Parameter(String name, double value, double lowerLimit, double upperLimit) {
        this.name = name;
        this.value = value;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    
     
    public boolean satisfyQuality(){
    return(lowerLimit<=value)&&(value<=upperLimit);
    
    }
   
}
