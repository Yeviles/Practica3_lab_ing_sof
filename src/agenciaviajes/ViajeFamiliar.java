/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes;

import java.util.Date;
//libgen.is = paginas para libros
/**
 *
 * @author Guido
 */
public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes de la familia
     */
    
    private int num_personas;
    //Constructor getters and setters

    public ViajeFamiliar(String p_origen, String p_destino, int p_valor, Date p_fec_salida, Date p_fec_llegada, int p_cantida_personas ) {
        this.origen = p_origen;
        this.destino = p_destino;
        this.costo = p_valor;
        this.fechaSalida = p_fec_salida;
        this.fechaLlegada = p_fec_llegada;
        this.num_personas = p_cantida_personas;
    }

    public int getNum_personas() {
        return num_personas;
    }

    public void setNum_personas(int num_personas) {
        this.num_personas = num_personas;
    }
    
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }

    public Object getFamilia() {
       return num_personas;
    }

}
