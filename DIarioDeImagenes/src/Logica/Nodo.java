package Logica;

public class Nodo {
    //Atributos:
    String nombre;
    String fecha;
    String emoticon;
    String descripcion;
    String foto;
    Nodo siguiente;
    Nodo anterior;

    //Constructores:
    public Nodo (){
    }

    public Nodo(String nombre, String fecha, String emoticon, String descripcion, String foto, Nodo siguiente, Nodo anterior) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.emoticon = emoticon;
        this.descripcion = descripcion;
        this.foto = foto;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    //Getters y setters:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmoticon() {
        return emoticon;
    }

    public void setEmoticon(String emoticon) {
        this.emoticon = emoticon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
}
