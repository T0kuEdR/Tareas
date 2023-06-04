package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class PersonajesNaruto {
    private int id;
    private String nombre;
    private String kekkeiGenkkai;
    private String clan;
    private String aldea;
    private String rango;
    private String imagenUrl;

    public PersonajesNaruto() {
    }

    public PersonajesNaruto(int id, String nombre,  String clan,String aldea,String kekkeiGenkkai,  String rango, String imagenUrl) {
        this.id = id;
        this.nombre = nombre;
        this.clan = clan;
        this.aldea = aldea;
        this.kekkeiGenkkai = kekkeiGenkkai;
        this.rango = rango;
        this.imagenUrl = imagenUrl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getKekkeiGenkkai() {
        return kekkeiGenkkai;
    }

    public void setKekkeiGenkkai(String kekkeiGenkkai) {
        this.kekkeiGenkkai = kekkeiGenkkai;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonajesNaruto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", kekkeiGenkkai='" + kekkeiGenkkai + '\'' +
                ", clan='" + clan + '\'' +
                ", aldea='" + aldea + '\'' +
                ", rango='" + rango + '\'' +
                ", imagenUrl='" + imagenUrl + '\'' +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException {
        URL imaurl = new URL(this.imagenUrl);
        return new ImageIcon(imaurl);
    }
}
