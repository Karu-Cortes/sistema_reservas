package org.example;

import java.util.Date;

abstract class Reservacion implements ReservacionI{

    /*Atributos*/
    private String nombreCompleto;
    private int documentoIdentificacion;
    private int numeroCelular;
    private String fechaHora;

    /*Constructor*/
    public Reservacion(String nombreCompleto, Integer documentoIdentificacion, Integer numeroCelular, String fechaHora) {

        this.nombreCompleto = nombreCompleto;
        this.documentoIdentificacion = documentoIdentificacion;
        this.numeroCelular = numeroCelular;
        this.fechaHora = fechaHora;
    }

    /*Getters and Setters*/
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(int documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    /*Métodos*/

    @Override
    public String toString() {
        return "Datos de Reservacion: \n" +
                "Nombre Completo= " + nombreCompleto + "\n" +
                "Documento de Identificacion= " + documentoIdentificacion + "\n"+
                "Numero Celular= " + numeroCelular + "\n" +
                "Fecha reservación= " + fechaHora;
    }


    public void confirmarDatos() {

    }

}
