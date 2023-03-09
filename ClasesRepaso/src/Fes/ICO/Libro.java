package Fes.ICO;

import java.awt.*;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private Color pasta;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public Libro(int paginas) {
        this.paginas = paginas;
    }

    public Libro(Color pasta) {
        this.pasta = pasta;
    }

    public Libro(String titulo, String autor, int paginas, Color pasta) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.pasta = pasta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Color getPasta() {
        return pasta;
    }

    public void setPasta(Color pasta) {
        this.pasta = pasta;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", pasta=" + pasta +
                '}';
    }

    public void abierto(){
        System.out.println("El libro esta abierto");
    }
    public void cerrado(){
        System.out.println("El libro esta cerrado");
    }
}
