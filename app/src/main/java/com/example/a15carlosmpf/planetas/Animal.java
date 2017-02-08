package com.example.a15carlosmpf.planetas;

/**
 * Created by a15carlosmpf on 2/8/2017.
 */
public class Animal {

    private int foto;
    private String nombre;
    private String descripcion;

    public Animal () {}

    public Animal (String nombre, String descripcion, int foto) {

        this.nombre=nombre;
        this.descripcion=descripcion;
        this.foto=foto;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
