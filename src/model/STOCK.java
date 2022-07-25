package model;

import controller.Controlador;
import java.io.Serializable;
import java.util.Date;
import java.util.Random;

public class STOCK implements Serializable{
    private long ID;
    private long RRN;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Prenda pelicula;

    public STOCK(Prenda pelicula) {
        Random r = new Random();
        this.ID = Controlador.totales + 1;
        this.fechaAlquiler = null;
        this.fechaDevolucion = null;
        this.pelicula = pelicula;
    }

    public STOCK(long ID, Date fechaAlquiler, Date fechaDevolucion, Prenda pelicula, long RRN) {
        this.ID = ID;
        this.RRN = RRN;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.pelicula = pelicula;
    }

    public STOCK(long RRN, long ID) {
        this.ID = ID;
        this.RRN = RRN;
    }

    public Prenda getPelicula() {
        return pelicula;
    }

    public long getID() {
        return ID;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public long getRRN() {
        return RRN;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
