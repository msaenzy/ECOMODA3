package model;

public class Prenda implements Comparable<Prenda> {
    private String titulo;
    private String genero;
    private String descripcion;
    private int precioDia;
    private int rating;
    private int stock;
    private long RRN;

    public Prenda(String titulo, String genero, String descripcion, int precioDia, int rating, int stock, long RRN) {
        this.titulo = titulo;
        this.genero = genero;
        this.descripcion = descripcion;
        this.precioDia = precioDia;
        this.rating = rating;
        this.stock = stock;
        this.RRN = RRN;
    }

    public Prenda(int RRN, String titulo) {
        this.titulo = titulo;
        this.RRN = RRN;
        this.genero = null;
        this.descripcion = null;
        this.precioDia = 0;
        this.rating = 0;
    }
    
    public Prenda(long RRN, String genero) {
        this.genero = genero;
        this.RRN = RRN;
        this.titulo = null;
        this.descripcion = null;
        this.precioDia = 0;
        this.rating = 0;
    }
    
    
    

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public int getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    public long getRRN() {
        return RRN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void alquilarPelicula() {
        this.stock--;
    }
    
    public void devolverPelicula() {
        this.stock++;
    }
    
    @Override
    public int compareTo(Prenda o) {
        return this.titulo.compareTo(o.getTitulo()); // dog name sort in ascending order 
        //return o.getName().compareTo(this.name); use this line for dog name sort in descending order 
    }

    @Override
    public String toString() {
        return this.titulo;
    }
    
    
}
