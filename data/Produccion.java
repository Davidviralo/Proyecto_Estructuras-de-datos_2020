/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author FABIa
 */
public class Produccion {
    private ArrayList materiasPrimas;
    private ArrayList<EtapaDeProceso> etapas;
    private int numeroProduccion;

    public ArrayList getMateriasPrimas() {
        return materiasPrimas;
    }

    public ArrayList<EtapaDeProceso> getEtapas() {
        return etapas;
    }

    public int getNumeroProduccion() {
        return numeroProduccion;
    }

    public void setMateriasPrimas(ArrayList materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }

    public void setEtapas(ArrayList<EtapaDeProceso> etapas) {
        this.etapas = etapas;
    }

    public void setNumeroProduccion(int numeroProduccion) {
        this.numeroProduccion = numeroProduccion;
    }
    
    
    
    
    
    
}
