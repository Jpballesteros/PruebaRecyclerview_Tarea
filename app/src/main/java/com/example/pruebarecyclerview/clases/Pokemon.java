package com.example.pruebarecyclerview.clases;

public class Pokemon {

    private String imagen;
    private String nombre;
    private String tipo;

    public Pokemon(String imagen, String nombre, String tipo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
