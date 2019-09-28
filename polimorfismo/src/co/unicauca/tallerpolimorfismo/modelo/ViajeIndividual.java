/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author JuanCamilo
 */
public class ViajeIndividual extends Viaje{

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    } 
    
    @Override
    public String descripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
