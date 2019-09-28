/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Personal
 */
public class ViajeFamiliar extends Viaje {
    private int familia;
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada,int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }
    @Override
    public String descripcion(){
            return "Viaje para disfrutar con toda tu familia";
        }
    public int getFamilia(){
            return 0;
        }
    public void setFamilia(int familia){
            this.familia=familia;
        }
    public String cualquierMetodo2(){
            return "Método implementado en la clase hija viaje familiar";
        }
}
