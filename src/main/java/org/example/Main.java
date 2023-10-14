package org.example;

public class Main {
    public static void main(String[] args) {

        TipoReservacion reservacion = new TipoReservacion("Maria Romero Guzman",1032345678, 320537865,"2023-10-14", 1, "restaurante");

        System.out.println(" ");
        reservacion.confirmarDatos();
        System.out.println(" ");
        System.out.println(reservacion.toString());
    }
}