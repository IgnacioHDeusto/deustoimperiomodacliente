package psc5.deustoimperiomodacliente.post;

import java.io.Serializable;

 /*{
        "nombre": "as",
        "descripcion": "ads",
        "precio": 12.0,
        "tamano": "M",
        "categoria": "Ropa",
        "id": 1
    } */

public class Articulo implements Serializable{
   

    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected String tamano;
    protected String categoria;
    protected int id;

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
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
