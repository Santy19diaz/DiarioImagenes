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
    
    // Método para intercambiar dos nodos en la lista
    private void swap(Nodo a, Nodo b) {
        String tempNombre = a.nombre;
        String tempFecha = a.fecha;
        String tempEmoticon = a.emoticon;
        String tempDescripcion = a.descripcion;
        String tempFoto = a.foto;

        a.nombre = b.nombre;
        a.fecha = b.fecha;
        a.emoticon = b.emoticon;
        a.descripcion = b.descripcion;
        a.foto = b.foto;

        b.nombre = tempNombre;
        b.fecha = tempFecha;
        b.emoticon = tempEmoticon;
        b.descripcion = tempDescripcion;
        b.foto = tempFoto;
    }

    // Método para realizar el particionado en Quick Sort
    private Nodo partition(Nodo low, Nodo high) {
        String pivot = high.fecha;
        Nodo i = low.anterior;

        for (Nodo j = low; j != high; j = j.siguiente) {
            if (j.fecha.compareTo(pivot) < 0) {
                i = (i == null) ? low : i.siguiente;
                swap(i, j);
            }
        }

        i = (i == null) ? low : i.siguiente;
        swap(i, high);
        return i;
    }

    // Método para implementar Quick Sort en la lista
    private void quickSort(Nodo low, Nodo high) {
        if (high != null && low != high && low != high.siguiente) {
            Nodo pivot = partition(low, high);

            quickSort(low, pivot.anterior);
            quickSort(pivot.siguiente, high);
        }
    }

    // Método público para iniciar Quick Sort en la lista
    public void sort(Nodo head) {
        Nodo last = head;
        while (last.siguiente != null) {
            last = last.siguiente;
        }
        quickSort(head, last);
    }
    
}

