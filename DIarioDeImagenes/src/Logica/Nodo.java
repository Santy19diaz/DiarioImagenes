package Logica;

public class Nodo {
    int id;
    String foto;
    String fecha;
    String nombre;
    String descripcion;
    String emote;
    Nodo siguiente;
    Nodo anterior;

    public Nodo (){
    }

    public Nodo(int id, String fecha, String nombre, String foto, Nodo siguiente, Nodo anterior) {
        this.id = id;
        this.foto = foto;
        this.fecha = fecha;
        this.nombre = nombre;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Nodo(int id, String foto, String fecha, String nombre, String descripcion, String emote, Nodo siguiente, Nodo anterior) {
        this.id = id;
        this.foto = foto;
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.emote = emote;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmote() {
        return emote;
    }

    public void setEmote(String emote) {
        this.emote = emote;
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
