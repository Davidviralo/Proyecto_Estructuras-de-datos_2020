package data;

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
        System.out.println("Creación de parametro");
        System.out.println("Ingrese el nombre del parámetro");
        this.name = input.nextLine();
        System.out.println("Digite limite inferior");
        this.lowerLimit= input.nextDouble();
        System.out.println("Digite limite superior");
        this.upperLimit= input.nextDouble();

        
    }

    public Parameter(String name, double value, double lowerLimit, double upperLimit) {
        this.name = name;
        this.value = value;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public boolean satisfyQuality() {
        return (lowerLimit <= value) && (value <= upperLimit);

    }
}
