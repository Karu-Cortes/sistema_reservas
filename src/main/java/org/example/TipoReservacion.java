package org.example;

import java.util.Date;

public class TipoReservacion extends Reservacion{

    /*Atributos*/

    private int idReservacion;
    private String nombreTipoReservacion;

    /*Constructor*/

    public TipoReservacion(String nombreCompleto, Integer documentoIdentificacion, Integer numeroCelular, String fechaHora, int idReservacion, String nombreTipoReservacion) {
        super(nombreCompleto, documentoIdentificacion, numeroCelular, fechaHora);
        this.idReservacion = idReservacion;
        this.nombreTipoReservacion = nombreTipoReservacion;
    }

    /*Getters and Setters*/
    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getNombreTipoReservacion() {
        return nombreTipoReservacion;
    }

    public void setNombreTipoReservacion(String nombreTipoReservacion) {
        this.nombreTipoReservacion = nombreTipoReservacion;
    }

    /*Métodos*/

    @Override
    public void confirmarDatos() {

        if (getDocumentoIdentificacion() <1) {
            System.out.println("El documento de identificación no puede ser nulo o vacío.");
        } else if (getNombreCompleto() == null || getNombreCompleto().isEmpty()) {
            System.out.println("El nombre completo no puede ser nulo o vacío.");
        }else if (getNumeroCelular() <1) {
            System.out.println("El número de celular no puede ser nulo o vacío.");
        }else if (getFechaHora() == null) {
            System.out.println("La fecha y hora de la reserva no puede ser nula.");
        }else if (idReservacion < 1) {
            System.out.println("El id de la reserva no puede ser nulo o menor que 1.");
        }else if (nombreTipoReservacion == null || nombreTipoReservacion.isEmpty()) {
            System.out.println("El nombre del tipo de reserva no puede ser nulo o vacío.");
        } else{
            System.out.println("Reservación realizada con exito:" );
        }

    }

    @Override
    public String toString() {
        return super.toString()+
                " \n"+
                "TipoReservacion: \n" +
                "Id de Reservacion= " + idReservacion +"\n"+
                "Nombre Tipo Reservacion= " + nombreTipoReservacion + "\n";
    }
}
