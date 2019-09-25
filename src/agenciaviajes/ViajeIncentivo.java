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
public class ViajeIncentivo extends Viaje {

    /**
     * Empresa que patrocina el viaje al empleado
     */
    private String empresa;
    //Constructor, getters and setters

      public ViajeIncentivo(String p_origen, String p_destino, int p_valor, Date p_fec_salida, Date p_fec_llegada, String p_empresa ) {
        this.origen = p_origen;
        this.destino = p_destino;
         this.costo = p_valor;
        this.fechaSalida = p_fec_salida;
        this.fechaLlegada = p_fec_llegada;
        this.empresa = p_empresa;
    }
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }

    public Object getEmpresa() {
        return empresa;
    }
    
    public void setEmpresa(String p_empresa) {
        empresa = p_empresa;
    }
    
}
