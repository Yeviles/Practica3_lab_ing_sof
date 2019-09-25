/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes;

import java.util.Date;

/**
 *
 * @author Guido
 */
public class ViajeTodoIncluido extends Viaje {

    // Constructores
      public ViajeTodoIncluido(String p_origen, String p_destino, int p_valor, Date p_fec_salida, Date p_fec_llegada) {
        this.origen = p_origen;
        this.destino = p_destino;
         this.costo = p_valor;
        this.fechaSalida = p_fec_salida;
        this.fechaLlegada = p_fec_llegada;
    }
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
    //No se sobreescribe cualquierMetodo2()
}
