package com.gerva.ejercicioweek4;

public class Mascota {

    private String nombre;
    private int foto;

    public Mascota(String nombre, int foto) {
        this.nombre = nombre;
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFoto() {
        return foto;
    }
}
